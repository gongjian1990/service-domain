package com.didong.serviceEntity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tb_phone_book")
public class TbPhoneBook {

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
