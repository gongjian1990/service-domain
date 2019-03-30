package com.didong.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 视频审核表
 * </p>
 *
 * @author jobob
 * @since 2019-03-30
 */
@Data
@TableName("tb_chk_vedio")
public class TbChkVedio implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long vId;

    /**
     * 视频ID
     */
    private Long vedioId;

    /**
     * 机器审核状态 0:待审核；1：审核通过；2：审核不通过
     */
    private Boolean machineChkStatus;

    /**
     * 机器审核时间
     */
    private Date machineChkTime;

    /**
     * 审核人员
     */
    private Long chkPerson;

    /**
     * 机器拒绝原因
     */
    private String machineRefuseReason;

    /**
     * 人工拒绝原因
     */
    private String personRefuseReason;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建时间
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Boolean vedioUpDownStatus;


}
