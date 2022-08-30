package com.example.vimash.bean.jpa.request;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections4.MapUtils;

import com.example.vimash.bean.jpa.jpa.response.PageResponse;

public abstract class PageRequest implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Integer noRecordInPage;
    public Integer currentPage;
    protected List<String> sortFields;
    protected String code1;
    protected String code2;
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
                value = "'%" + String.valueOf(value).replaceAll("_", "\\\\_").replaceAll("%", "\\\\%") + "%'";
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

    public abstract StringBuilder getQuery();

    public abstract StringBuilder getCount();

    @SuppressWarnings("rawtypes")
    public abstract Class getEntityClass();

    @SuppressWarnings("rawtypes")
    public abstract <T extends PageResponse> Class<T> getResponseClass();

    public boolean hasPaging() {
        return this.currentPage != null || this.noRecordInPage != null;
    }

    public String getCode1() {
        return code1;
    }

    public void setCode1(String code1) {
        this.code1 = code1;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
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
