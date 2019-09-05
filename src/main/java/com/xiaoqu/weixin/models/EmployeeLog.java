package com.xiaoqu.weixin.models;

import java.util.Date;

public class EmployeeLog {
    private Integer id;

    private String empno;

    private String empname;

    private String actionlog;

    private String os;

    private String browse;

    private String ip;

    private Date updatetime;

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

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getActionlog() {
        return actionlog;
    }

    public void setActionlog(String actionlog) {
        this.actionlog = actionlog == null ? null : actionlog.trim();
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getBrowse() {
        return browse;
    }

    public void setBrowse(String browse) {
        this.browse = browse == null ? null : browse.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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
        EmployeeLog other = (EmployeeLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEmpno() == null ? other.getEmpno() == null : this.getEmpno().equals(other.getEmpno()))
            && (this.getEmpname() == null ? other.getEmpname() == null : this.getEmpname().equals(other.getEmpname()))
            && (this.getActionlog() == null ? other.getActionlog() == null : this.getActionlog().equals(other.getActionlog()))
            && (this.getOs() == null ? other.getOs() == null : this.getOs().equals(other.getOs()))
            && (this.getBrowse() == null ? other.getBrowse() == null : this.getBrowse().equals(other.getBrowse()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEmpno() == null) ? 0 : getEmpno().hashCode());
        result = prime * result + ((getEmpname() == null) ? 0 : getEmpname().hashCode());
        result = prime * result + ((getActionlog() == null) ? 0 : getActionlog().hashCode());
        result = prime * result + ((getOs() == null) ? 0 : getOs().hashCode());
        result = prime * result + ((getBrowse() == null) ? 0 : getBrowse().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }
}