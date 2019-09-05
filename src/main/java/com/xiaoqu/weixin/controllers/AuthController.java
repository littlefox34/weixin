package com.xiaoqu.weixin.controllers;

import com.xiaoqu.weixin.models.Employee;
import com.xiaoqu.weixin.models.formatmodel.JsonResult;
import com.xiaoqu.weixin.models.viewmodel.LoginInfo;
import com.xiaoqu.weixin.services.IEmployeeService;
import io.swagger.annotations.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/auth")
@Api("swaggerTestController相关api")
public class AuthController {
    //slf4j记录日志，可以不使用
    private Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    @Lazy
    private IEmployeeService employeeService;

    @PostMapping("/login")
    @ApiOperation(value="用户登录", notes="更具用户名和密码登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid", value = "用户名", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "userpass", value = "密码", required = true, dataType = "String", paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code=50010,message = "参数错误！"),
            @ApiResponse(code=59000,message = "账户已被禁用或者本人已离职！"),
            @ApiResponse(code=59001,message = "用户名或密码错误！")
    })
    public JsonResult dologin(@Valid LoginInfo info){
        if (StringUtils.isBlank(info.getUserid()) || StringUtils.isBlank(info.getUserpass())) {
            return JsonResult.errorMsg(50010,"账号密码不能为空");
        }
        Employee employee = new Employee();
        try {
            UsernamePasswordToken token = new UsernamePasswordToken(info.getUserid(), info.getUserpass());
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            String user = (String) subject.getPrincipal();
            employee = employeeService.getInfoByEmpname(user);
            logger.info("usercode : " + employee.getEmpno());
            return JsonResult.ok(employee.getEmpno());
        } catch (DisabledAccountException e) {
            return  JsonResult.errorMsg(59000,"账户已被禁用或者本人已离职！");
        } catch (AuthenticationException e) {
            return  JsonResult.errorMsg(59001,"用户名或密码错误！");
        }
    }
}
