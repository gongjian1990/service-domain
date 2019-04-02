package com.didong.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("phone_book")
public class PhoneBook {

    private Integer id;

    private String udid;

    private String contactName;

    private String contact_phone;

    private Integer delFlag;

    private Date createTime;

    private Date lastUpdateTime;
}
