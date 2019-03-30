package com.didong.entity;

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
@TableName("tb_vedio_report")
public class TbVedioReport implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long rId;

    /**
     * 视频ID
     */
    private Long vedioId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 视频ID
     */
    private Long reportUserId;

    /**
     * 举报原因
     */
    private String reportReason;

    /**
     * 点赞时间
     */
    private Date createTime;

    /**
     * 举报状态
     */
    private Boolean reportStatus;


}
