package com.mybatis.controller;

import com.mybatis.entity.UserEntity;
import com.mybatis.service.UserService;
import com.mybatis.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-3-1 13:33
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    /**
     * 保存用户
     */
    //@SysLog("保存用户")
    @PostMapping("/save")
    //@RequiresPermissions("sys:user:save")
    public R save(@RequestBody UserEntity user){

        System.out.println("name:"+user.getName());
        System.out.println("age:" + user.getAge());
        System.out.println("gender:"+user.getGender());
        //userService.save(user);

        return R.ok();
    }
    
    @GetMapping("/get")
    public R get(@RequestParam Map<String,Object> params){
        System.out.println("params:"+params);
        System.out.println("params:"+params.get("name"));
        System.out.println("params:"+params.get("age"));
        System.out.println("params:"+params.get("gender"));
        return R.ok();
    }
}
