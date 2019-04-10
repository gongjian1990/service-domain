package com.didong.serviceEntity;

import lombok.Data;

/**
 * 举报类型表
 */
@Data
public class TbVideoReportType {

    /*举报Id*/
    private Integer id;
    /*举报类型id*/
    private long ReportTypeId;
    /*上级目录Id*/
    private Integer upId;
    /*举报类型内容*/
    private String reportContent;

}
