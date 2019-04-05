package com.didong.serviceEntity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 视频表
 * </p>
 *
 * @author jobob
 * @since 2019-03-30
 */
@Data
@TableName("tb_video")
public class TbVideo implements Serializable {

    private static final long serialVersionUID = 1L;
    /* 主键ID */
    @TableId(value = "id", type = IdType.AUTO)
    private long id;
    /* 视频ID */
    private Long videoId;
    /* 用户ID */
    private Long userId;
    /* 视频url */
    private String videoUrl;
    /* 标题 */
    private String videoTitle;
    /* 视频描述 */
    private String videoDesc;
    /* 经度 */
    private Double longitude;
    /* 纬度 */
    private Double latitude;
    /* 拍摄地点 */
    private String addressName;
    /* 4帧图 */
    private String fourFps;
    /* 1帧图 */
    private String oneFps;
    /* 删除标识 */
    private Boolean delFlag;
    /* 上传时间 */
    private Date uploadTime;
    /* 创建时间 */
    private Date createTime;
    /* 最后更新时间 */
    private Date lastUpdateTime;

}
