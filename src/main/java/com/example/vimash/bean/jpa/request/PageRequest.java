package com.example.vimash.bean.jpa.request;

import com.example.vimash.bean.jpa.jpa.response.PageResponse;
import org.apache.commons.collections4.MapUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class PageRequest implements Serializable {
    public Integer noRecordInPage;
    public Integer currentPage;
    protected List<String> sortFields;
    protected Map<String, Object> searchFields;

    public PageRequest addSearchField(String key, Object value, boolean... isNotUsingLike) {
        if (this.searchFields == null) {
            this.searchFields = new HashMap<>();
        }

        if (Objects.isNull(value))
            return this;
        if (value instanceof String) {
            String trimmedValue = ((String) value).trim();
            if (trimmedValue.length() == 0) return this;
            if (isNotUsingLike.length == 0 || !isNotUsingLike[0]) {
                value = "%" + String.valueOf(value).replaceAll("_", "\\\\_").replaceAll("%", "\\\\%") + "%";
            }
        }
        this.searchFields.put(key, value);
        return this;
    }

    // string sql where
    public StringBuilder getSqlWhere(String alias) {
        StringBuilder sqlWhere = new StringBuilder();
        if (!MapUtils.isEmpty(this.searchFields)) {
            sqlWhere.append(" WHERE ");
            StringBuilder sql = sqlWhere;
            this.searchFields.forEach((k, v) -> sql.append(String.format(alias + ".%s = :%s AND ", k, k)));
            sqlWhere = sqlWhere.delete(sqlWhere.length() - 4, sqlWhere.length());
        }
        return sqlWhere;
    }

    // get noRecordInPage
    public PageRequest noRecordInPage(Integer noRecordInPage) {
        this.noRecordInPage = noRecordInPage;
        return this;
    }

    // get currenPage
    public PageRequest currentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    // append sql condition
    protected abstract void appendCondition(StringBuilder sql);

    @SuppressWarnings("rawtypes")
    public abstract Class getEntityClass();

    @SuppressWarnings("rawtypes")
    public abstract <T extends PageResponse> Class<T> getResponseClass();

    public boolean hasPaging() {
        return this.currentPage != null || this.noRecordInPage != null;
    }

    public Integer getFirstResult() {
        return (currentPage - 1) * noRecordInPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public Integer getNoRecordInPage() {
        return noRecordInPage;
    }

    public Map<String, Object> getSearchFields() {
        return searchFields;
    }
}
