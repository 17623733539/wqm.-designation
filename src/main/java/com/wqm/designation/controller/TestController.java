package com.wqm.designation.controller;

import com.wqm.designation.entity.User;
import com.wqm.designation.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: WangQiMing
 * @Date: 2019/3/25 14:07
 * @Description:
 */
@Api(value = "/HealthCheck", description = "心跳检测控制层", hidden = true)
@Controller
@RequestMapping("/api/v2.0/sale")
public class TestController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @ApiOperation(value = "心跳检测", notes = "心跳检测", httpMethod = "GET")
    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
    public Map healthCheck() {
        Map map = new HashMap();
        map.put("请求成功", null);
        List<User> userList = userService.getList();
        System.out.println(userList);
        return map;
    }
}
