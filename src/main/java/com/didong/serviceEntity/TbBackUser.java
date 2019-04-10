package com.didong.serviceEntity;

import lombok.Data;

/**
 * 后台管理人员表，后期根据需求再添加字段
 */
@Data
public class TbBackUser {

    private Integer id;
    /*后台用户Id*/
    private Long backUserId;
    /*账号*/
    private String username;
    /*密码*/
    private String password;
    /*昵称*/
    private String nickName;
    /*手机号*/
    private String phone;
    /*角色*/
    private Integer role;
    /*部门Id*/
    private Integer deptNo;

}
