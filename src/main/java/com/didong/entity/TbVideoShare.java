package com.didong.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 视频分享表
 * </p>
 *
 * @author jobob
 * @since 2019-03-30
 */
@Data
@TableName("tb_video_share")
public class TbVideoShare implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long sId;

    /**
     * 视频ID
     */
    private Long videoId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 分享人ID
     */
    private Long shareUserId;

    /**
     * 分享平台
     */
    private String sharePlatform;

    /**
     * 点赞时间
     */
    private Date createTime;


}
