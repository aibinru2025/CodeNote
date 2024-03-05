package com.mybatis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-29 15:07
 * @description:
 */
@Data
//@Builder
@TableName("t_user")
public class UserEntity {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private Integer gender;
}
