package com.didong.serviceEntity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user_interest")
public class UserInterest {

    @TableId(value = "id", type = IdType.AUTO)
    private long id;

    private String userId;

    private String optCode;

    private String optValue;

    private Integer delFlag;

    private Date createTime;

    private Date lastUpdateTime;
}
