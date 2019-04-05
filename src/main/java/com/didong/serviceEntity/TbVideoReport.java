package com.didong.serviceEntity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户关注表
 * </p>
 *
 * @author jobob
 * @since 2019-03-30
 */
@Data
@TableName("tb_video_report")
public class TbVideoReport implements Serializable {

    private static final long serialVersionUID = 1L;

    /* 主键ID */
    @TableId(value = "id", type = IdType.AUTO)
    private long id;
    /* 视频ID */
    private Long videoId;
    /* 拍摄用户ID */
    private Long userId;
    /* 举报用户ID */
    private Long reportUserId;
    /* 举报原因 */
    private String reportReason;
    /* 举报时间 */
    private String reportTime;
    /* 举报状态 */
    private Boolean reportStatus;
    /* 创建时间 */
    private Date createTime;
    /* 最后更新时间 */
    private Date lastUpdateTime;

}
