package com.didong.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("tb_chk_video")
public class TbChkVideo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long vId;

    /**
     * 视频ID
     */
    private Long videoId;

    /**
     * 机器审核状态 0:待审核；1：审核通过；2：审核不通过 3:未知
     */
    private Integer machineChkStatus;

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
     * 用户ID
     */
    private Long userId;

    /**
     * 上下架状态(0:待上架 1:下架 2:上架）
     */
    private Integer vedioUpDownStatus;
    /**
     * 机器审核ID
     */
    private String taskId;

    /**
     * 人工审核状态
     */
    private Integer personChkStatus;
    /**
     * 最后更新时间
     */
    private Date lastUpdateTime;



}
