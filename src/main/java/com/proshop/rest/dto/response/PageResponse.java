package com.proshop.rest.dto.response;

import org.springframework.data.domain.Page;

import java.util.List;

public class PageResponse<T> {

    private List<T> list;
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean isLastPage;

    public PageResponse() {
    }

    public PageResponse(Page<?> page, List<T> list) {
        this.list = list;
        this.pageNumber = page.getNumber() + 1;
        this.pageSize = page.getSize();
        this.totalElements = page.getTotalElements();
        this.totalPages = page.getTotalPages();
        this.isLastPage = page.isLast();
    }


    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isLastPage() {
        return isLastPage;
    }

    public void setLastPage(boolean lastPage) {
        isLastPage = lastPage;
    }

    @Override
    public String toString() {
        return "PageResponse[" + "list=" + list.toString() + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", totalElements=" + totalElements + ", totalPages=" + totalPages + ", isLastPage=" + isLastPage + ']';
    }
}
