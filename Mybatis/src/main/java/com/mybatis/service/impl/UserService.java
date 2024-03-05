package com.mybatis.service.impl;

import com.mybatis.utils.R;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-3-4 17:43
 * @description:
 */
public class UserService {
    public static R sendCode(String phone) {
        // 1.校验手机号
        String regex = "^1[3456789]\\d{9}$";

        if (!phone.matches(regex)) {
            // 2.如果不符合，返回错误信息
            return new R(100,"手机号格式错误！");
        }

//      3. 生成验证码
        String code = "";
        for (int i = 0; i < 6; i++) {
            int var = new Random().nextInt(10);
            code = code + var;
        }

        Map<String,Object> param = new HashMap<>();
        param.put("code", code);

        // 4.保存验证码到 redis
        //redisCache.setCacheObject(phone,code);

        Map<String,String> map=new HashMap();
        map.put("phone", phone);
        map.put("code", code);
        // 5.保存验证码和手机号到队列
        //rabbitTemplate.convertAndSend("market.exChanges","market",map);

        return new R(200, "发送成功");
    }

}
