package com.cn.wavetop.dataone.controller;

import com.cn.wavetop.dataone.entity.DataChangeSettings;
import com.cn.wavetop.dataone.service.DataChangeSettingsService;
import com.cn.wavetop.dataone.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author yongz
 * @Date 2019/10/10、12:56
 * # 数据源变化设置
 */
@RestController
@RequestMapping("/data_change_settings")
public class DataChangeSettingsController {

    @Autowired
    private DataChangeSettingsService service;

    @ApiOperation(value = "",httpMethod = "GET",protocols = "HTTP",produces = "application/json",notes = "查询用户信息")
    @ApiImplicitParam(name = "username",value = "",dataType = "String")
    @GetMapping("/data_change_all")
    public List<DataChangeSettings> data_change_all() {
        return service.getDataChangeSettingsAll();
    }


}
