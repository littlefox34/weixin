package com.xiaoqu.weixin.controllers;

import com.xiaoqu.weixin.models.Employee;
import com.xiaoqu.weixin.models.Permission;
import com.xiaoqu.weixin.models.Position;
import com.xiaoqu.weixin.models.formatmodel.JsonResult;
import com.xiaoqu.weixin.models.viewmodel.ResultLoginInfo;
import com.xiaoqu.weixin.services.IEmployeeService;
import com.xiaoqu.weixin.services.IPermissionService;
import com.xiaoqu.weixin.services.IPositionService;
import io.swagger.annotations.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IPositionService positionService;
    @Autowired
    private IPermissionService permissionService;


    @ApiOperation(value="获取用户信息", notes="根据ID")
    @ApiImplicitParam(name="code",value="用户Token",required=true, dataType = "String")
    @ApiResponses({
            @ApiResponse(code=50010,message = "参数错误"),
            @ApiResponse(code=50100,message = "用户不存在，或已经禁用")
    })
    @GetMapping(value="/info/{id}")
    public JsonResult getEmployeeInfo(@PathVariable("id") String code){
        if (StringUtils.isBlank(code)){
            return JsonResult.errorMsg(50010,"token错误，登录已失效！");
        }
        Employee employeeInfo = employeeService.getInfoByEmpno(code);
        if(employeeInfo == null){
            return JsonResult.errorMsg(50100,"用户不存在，或已经禁用！");
        }
        List<Position> roleList = positionService.getListByEmpno(code);
        List<String> roleIdList = roleList.stream().map(Position::getPosno).collect(Collectors.toList());
        List<Permission> permissionList = permissionService.getListByEmpno(code);
        List<String> perIdList =  permissionList.stream().map(Permission::getAuthsign).collect(Collectors.toList());
        ResultLoginInfo testInfo = new ResultLoginInfo(employeeInfo.getEmpno(),employeeInfo.getEmpname(),employeeInfo.getAvater(), roleIdList, perIdList);

        return JsonResult.ok(testInfo);
    }
}
