package com.example.vimash.bean.jpa.jpa.response;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import org.apache.commons.collections4.CollectionUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class PageResponse<R> implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Integer totalPage;
    protected Integer currentPage;
    protected long totalRecords;
    protected Integer noRecordInPage;
    protected List<R> results;

    public PageResponse() {}

    // get info for this
    public PageResponse<R> pageInfo(Integer currentPage, Integer itemsOfPage, long totalRecords) {
        if (currentPage == null || currentPage < 1) {
            this.currentPage = 1;
        } else {
            this.currentPage = currentPage;
        }
        this.totalRecords = totalRecords;
        if (Objects.nonNull(itemsOfPage)) {
            this.totalPage = (int) Math.ceil((float) totalRecords / itemsOfPage);
        } else {
            this.totalPage = 1;
        }
        return this;
    }

    // get totalPage
    public PageResponse<R> pageInfo(int totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public PageResponse<R> rawResults(List rawResults) {
        this.results = parseResult(rawResults);
        this.noRecordInPage = results.size();
        return this;
    }

    protected List<R> parseResult(List<R> rawResults) {
        return rawResults;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return CollectionUtils.isEmpty(this.results);
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public Integer getNoRecordInPage() {
        return noRecordInPage;
    }

    public void setNoRecordInPage(Integer noRecordInPage) {
        this.noRecordInPage = noRecordInPage;
    }

    public List<R> getResults() {
        return results;
    }

    public void setResults(List<R> results) {
        this.results = results;
    }
}
