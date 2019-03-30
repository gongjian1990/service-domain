package com.didong.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 视频点赞表
 * </p>
 *
 * @author jobob
 * @since 2019-03-30
 */
@Data
@TableName("tb_thumbs_up")
public class TbThumbsUp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long tId;

    /**
     * 视频ID
     */
    private Long vedioId;

    /**
     * 拍摄用户ID
     */
    private Long userId;

    /**
     * 点赞用户ID
     */
    private Long thumbUpUserId;

    /**
     * 点赞时间
     */
    private Date createTime;

    /**
     * 删除标识
     */
    private Boolean delFlag;

    /**
     * 删除时间
     */
    private Date delTime;


}
