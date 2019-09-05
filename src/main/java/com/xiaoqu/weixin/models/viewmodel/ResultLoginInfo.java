package com.xiaoqu.weixin.models.viewmodel;

import java.util.List;

public class ResultLoginInfo {
    private String ucode;
    private String uname;
    private String avater;
    private List<String> roles;
    private List<String> permissions;

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public ResultLoginInfo(String ucode, String uname, String avater, List<String> role, List<String> permission) {
        this.ucode = ucode;
        this.uname = uname;
        this.avater = avater;
        this.roles = role;
        this.permissions = permission;
    }


}
