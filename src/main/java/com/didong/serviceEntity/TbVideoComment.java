package com.didong.serviceEntity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 视频评论表
 * </p>
 *
 * @author jobob
 * @since 2019-03-30
 */
@Data
@TableName("tb_video_comment")
public class TbVideoComment implements Serializable {

    private static final long serialVersionUID = 1L;

    /* 主键ID */
    @TableId(value = "id", type = IdType.AUTO)
    private long id;
    /* 视频ID */
    private Long videoId;
    /* 拍摄用户ID */
    private Long userId;
    /* 评论用户ID */
    private Long commentUserId;
    /* 评论内容 */
    private String commentContent;
    /* 评论时间 */
    private Date comment_time;
    /* 删除标识 */
    private Boolean delFlag;
    /* 删除时间 */
    private Date delTime;
    /* 创建时间 */
    private Date createTime;
    /* 最后更新时间 */
    private Date lastUpdateTime;

}
