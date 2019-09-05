package com.xiaoqu.weixin.models;

import java.util.Date;

public class Position {
    private Integer id;

    private String posname;

    private Boolean status;

    private String posno;

    private Date updatetime;

    private String parentno;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname == null ? null : posname.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPosno() {
        return posno;
    }

    public void setPosno(String posno) {
        this.posno = posno == null ? null : posno.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getParentno() {
        return parentno;
    }

    public void setParentno(String parentno) {
        this.parentno = parentno == null ? null : parentno.trim();
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
        Position other = (Position) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPosname() == null ? other.getPosname() == null : this.getPosname().equals(other.getPosname()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPosno() == null ? other.getPosno() == null : this.getPosno().equals(other.getPosno()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getParentno() == null ? other.getParentno() == null : this.getParentno().equals(other.getParentno()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPosname() == null) ? 0 : getPosname().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPosno() == null) ? 0 : getPosno().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getParentno() == null) ? 0 : getParentno().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }
}