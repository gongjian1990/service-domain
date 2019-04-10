package com.didong.serviceEntity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 用户关注表
 * </p>
 *
 * @author jobob
 * @since 2019-03-30
 */
@Data
public class TbVideoReport implements Serializable {

    private static final long serialVersionUID = 1L;

    /* 主键ID */
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
    private Integer reportStatus;
    /* 创建时间 */
    private Date createTime;
    /* 最后更新时间 */
    private Date lastUpdateTime;
    /*举报图图片*/
    private List videoReportPhoto;
    /*举报类型*/
    private Integer reportType;
}
