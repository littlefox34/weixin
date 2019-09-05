package com.xiaoqu.weixin.models;

import java.util.Date;

public class Employee {
    private Integer id;

    private String empno;

    private String avater;

    private String empname;

    private String emppass;

    private Boolean status;

    private Date updatetime;

    private Date createtime;

    private Date lastlogintime;

    private String lastloginip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater == null ? null : avater.trim();
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmppass() {
        return emppass;
    }

    public void setEmppass(String emppass) {
        this.emppass = emppass == null ? null : emppass.trim();
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
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
        Employee other = (Employee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmpno() == null ? other.getEmpno() == null : this.getEmpno().equals(other.getEmpno()))
            && (this.getAvater() == null ? other.getAvater() == null : this.getAvater().equals(other.getAvater()))
            && (this.getEmpname() == null ? other.getEmpname() == null : this.getEmpname().equals(other.getEmpname()))
            && (this.getEmppass() == null ? other.getEmppass() == null : this.getEmppass().equals(other.getEmppass()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getLastlogintime() == null ? other.getLastlogintime() == null : this.getLastlogintime().equals(other.getLastlogintime()))
            && (this.getLastloginip() == null ? other.getLastloginip() == null : this.getLastloginip().equals(other.getLastloginip()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmpno() == null) ? 0 : getEmpno().hashCode());
        result = prime * result + ((getAvater() == null) ? 0 : getAvater().hashCode());
        result = prime * result + ((getEmpname() == null) ? 0 : getEmpname().hashCode());
        result = prime * result + ((getEmppass() == null) ? 0 : getEmppass().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastlogintime() == null) ? 0 : getLastlogintime().hashCode());
        result = prime * result + ((getLastloginip() == null) ? 0 : getLastloginip().hashCode());
        return result;
    }
}