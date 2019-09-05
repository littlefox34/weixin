package com.xiaoqu.weixin.models.viewmodel;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

public class LoginInfo {

    @NotEmpty(message="用户名或密码不能为空")
    private String userid;

    @NotEmpty(message="用户名或密码不能为空")
    @Length(min=6,message="密码长度不能小于6位")
    private String userpass;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }


    /*private String verifycode;

    public String getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode;
    }*/
}
