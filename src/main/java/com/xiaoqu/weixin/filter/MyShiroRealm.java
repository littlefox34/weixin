package com.xiaoqu.weixin.filter;

import com.xiaoqu.weixin.models.Employee;
import com.xiaoqu.weixin.services.IEmployeeService;
import com.xiaoqu.weixin.services.IPositionService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.web.subject.WebSubject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.Set;

/**
 * Shiro认证和授权
 *
 * @Author Rocky
 * @Create 2018-11-06 10:28
 */
public class MyShiroRealm extends AuthorizingRealm {

    //slf4j记录日志，可以不使用
    private Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    @Autowired
    @Lazy
    private IEmployeeService userService;
    @Autowired
    @Lazy
    private IPositionService roleService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("开始认证(doGetAuthenticationInfo)");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String name = token.getUsername();
        String password = String.valueOf(token.getPassword());
        Employee user = userService.getInfoByEmpname(name);

        if (user == null) {
            throw new UnknownAccountException();
        } else if (user.getStatus() == false) {
            throw new LockedAccountException();
        } else {
            logger.info("账号：" + user.getEmpname());
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    user.getEmpname(), //
                    user.getEmppass(), //密码，写死
                    ByteSource.Util.bytes(user.getEmpno()),//salt=username+salt
                    getName()  //realm name
            );
            return authenticationInfo;
        }

    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("开始授权(doGetAuthorizationInfo)");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        HttpServletRequest request = (HttpServletRequest) ((WebSubject) SecurityUtils.getSubject()).getServletRequest();//这个可以用来获取在登录的时候提交的其他额外的参数信息
        String username = (String) principals.getPrimaryPrincipal();//这里是写的demo，后面在实际项目中药通过这个登录的账号去获取用户的角色和权限，这里直接是写死的
        //受理权限
        //角色
        Set<String> roles = new HashSet<String>();
        roles.add("role1");
        authorizationInfo.setRoles(roles);
        //权限
        Set<String> permissions = new HashSet<String>();
        permissions.add("user:list");
        //permissions.add("user:add");
        authorizationInfo.setStringPermissions(permissions);
        return authorizationInfo;

    }


}
