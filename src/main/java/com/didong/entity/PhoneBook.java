package com.didong.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("phone_book")
public class PhoneBook {

    private static final long serialVersionUID = 811492177251026132L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String udid;

    private String contactName;

    private String contactPhone;

    private Integer delFlag;

    private Date createTime;

    private Date lastUpdateTime;
}
