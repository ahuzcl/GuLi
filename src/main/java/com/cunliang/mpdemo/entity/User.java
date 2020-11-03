package com.cunliang.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @Data 注解可以直接生成get&Set方法
 */
@Data
public class User {

    private Long ID;
    private String name;
    private Integer age;
    private String email;
    @TableField(fill = FieldFill.INSERT)
    private Date create_time;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date update_time;

}
