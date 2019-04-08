package com.didong.serviceEntity;

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
@TableName("tb_video_chk")
public class TbVideoChk implements Serializable {

    private static final long serialVersionUID = 1L;

    /* 主键ID */
    @TableId(value = "id", type = IdType.AUTO)
    private long id;
    /* 视频ID */
    private Long videoId;
    /* 用户ID */
    private Long userId;
    /* 机器审核状态 0:待审核；1：审核通过；2：审核不通过 3:未知 */
    private Integer machineChkStatus;
    /* 机器审核时间 */
    private Date machineChkTime;
    /* 机器拒绝原因 */
    private String machineRefuseReason;
    /* 审核人员 */
    private Long chkPerson;
    /* 人工审核状态（0待审核 1审核通过 2审核不通过）*/
    private Integer personChkStatus;
    /* 人工拒绝原因 */
    private String personRefuseReason;
    /* 人工审核时间 */
    private Date personChkTime;
    /* 上下架状态(0:待上架 1:下架 2:上架）*/
    private Integer videoUpDownStatus;
    /* 机器审核ID */
    private String taskId;
    /* 创建时间 */
    private Date createTime;
    /* 最后更新时间 */
    private Date lastUpdateTime;

}
