package cn.util;

public class PageBean {
    private Integer pageNo;
    private Integer pageSize;
    private Integer pageTotal;
    private Integer countTotal;
    private Integer startRow;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getCountTotal() {
        return countTotal;
    }

    public void setCountTotal(Integer countTotal) {
        this.countTotal = countTotal;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public PageBean() {
    }

    public PageBean(Integer pageNo, Integer pageSize, Integer countTotal) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.countTotal = countTotal;
        this.pageTotal = countTotal%pageSize==0?countTotal/pageSize:countTotal/pageSize+1;
        this.startRow=(pageNo-1)*pageSize;
    }
}
