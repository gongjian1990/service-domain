package com.didong.serviceEntity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tb_dictionary")
public class TbDictionary {

    private long id;

    private String operator;

    private String optGroup;

    private String optCode;

    private String optValue;

    private String optDesc;

    private Integer delFlag;

    private Date createTime;

    private Date lastUpdateTime;
}
