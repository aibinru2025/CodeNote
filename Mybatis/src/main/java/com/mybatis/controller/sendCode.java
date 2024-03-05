package com.mybatis.controller;

import com.mybatis.service.impl.UserService;
import com.mybatis.utils.R;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-3-4 17:39
 * @description:
 */
public class sendCode {
    @RequestMapping("/sendCode")
    public R sendCode(String phone){
        return UserService.sendCode(phone);
    }

}
