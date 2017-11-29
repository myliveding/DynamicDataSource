package com.dzr.dds.controller;

import com.dzr.dds.po.User;
import com.dzr.dds.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dingzr
 * @Description
 * @ClassName TestController
 * @since 2017/11/29 17:12
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/test1")
    public String test(){
        for(User d: userService.getList()){
            System.out.println("test--" + d);
        }
        for(User d : userService.getListByDs1()){
            System.out.println(d);
        }
        return"ok";
    }
}
