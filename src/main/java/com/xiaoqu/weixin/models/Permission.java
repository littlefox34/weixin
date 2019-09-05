package com.xiaoqu.weixin.models;

import java.util.Date;

public class Permission {
    private Integer id;

    private String authname;

    private String authno;

    private String authsign;

    private String parentno;

    private Boolean status;

    private Date updatetime;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthname() {
        return authname;
    }

    public void setAuthname(String authname) {
        this.authname = authname == null ? null : authname.trim();
    }

    public String getAuthno() {
        return authno;
    }

    public void setAuthno(String authno) {
        this.authno = authno == null ? null : authno.trim();
    }

    public String getAuthsign() {
        return authsign;
    }

    public void setAuthsign(String authsign) {
        this.authsign = authsign == null ? null : authsign.trim();
    }

    public String getParentno() {
        return parentno;
    }

    public void setParentno(String parentno) {
        this.parentno = parentno == null ? null : parentno.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
        Permission other = (Permission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAuthname() == null ? other.getAuthname() == null : this.getAuthname().equals(other.getAuthname()))
            && (this.getAuthno() == null ? other.getAuthno() == null : this.getAuthno().equals(other.getAuthno()))
            && (this.getAuthsign() == null ? other.getAuthsign() == null : this.getAuthsign().equals(other.getAuthsign()))
            && (this.getParentno() == null ? other.getParentno() == null : this.getParentno().equals(other.getParentno()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAuthname() == null) ? 0 : getAuthname().hashCode());
        result = prime * result + ((getAuthno() == null) ? 0 : getAuthno().hashCode());
        result = prime * result + ((getAuthsign() == null) ? 0 : getAuthsign().hashCode());
        result = prime * result + ((getParentno() == null) ? 0 : getParentno().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }
}