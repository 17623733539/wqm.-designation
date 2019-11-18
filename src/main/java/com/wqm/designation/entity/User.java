package com.wqm.designation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: WangQiMing <br>
 * @createDate 2019/11/09 17:26 <br>
 * @Description:
 */
@Data
@TableName(value = "user")
public class User {

    @TableId(type = IdType.UUID)
    private Long id;


    @TableField(value = "name")

    private String name;

    @TableField(value = "age")
    private Integer age;

    @TableField(value = "email")
    private String email;
}
