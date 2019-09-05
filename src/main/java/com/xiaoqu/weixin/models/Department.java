package com.xiaoqu.weixin.models;

import java.util.Date;

public class Department {
    private Integer id;

    private String dptname;

    private Boolean status;

    private String dptno;

    private String parentno;

    private Date updatetime;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDptname() {
        return dptname;
    }

    public void setDptname(String dptname) {
        this.dptname = dptname == null ? null : dptname.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDptno() {
        return dptno;
    }

    public void setDptno(String dptno) {
        this.dptno = dptno == null ? null : dptno.trim();
    }

    public String getParentno() {
        return parentno;
    }

    public void setParentno(String parentno) {
        this.parentno = parentno == null ? null : parentno.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Department other = (Department) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDptname() == null ? other.getDptname() == null : this.getDptname().equals(other.getDptname()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDptno() == null ? other.getDptno() == null : this.getDptno().equals(other.getDptno()))
            && (this.getParentno() == null ? other.getParentno() == null : this.getParentno().equals(other.getParentno()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDptname() == null) ? 0 : getDptname().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDptno() == null) ? 0 : getDptno().hashCode());
        result = prime * result + ((getParentno() == null) ? 0 : getParentno().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }
}