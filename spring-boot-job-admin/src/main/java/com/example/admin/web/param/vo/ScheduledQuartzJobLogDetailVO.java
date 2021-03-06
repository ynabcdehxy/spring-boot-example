package com.example.admin.web.param.vo;

import lombok.Data;

import java.util.Date;

/**
 * The table 任务日志记录表
 */
@Data
public class ScheduledQuartzJobLogDetailVO {

    /**
     * ID
     */
    private Integer id;

    /**
     * 日志内容
     */
    private String content;

    /**
     * 日志描述
     */
    private String logDesc;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 操作人ID
     */
    private String operateId;

    /**
     * 操作人名称
     */
    private String operateName;

    /**
     * 任务ID
     */
    private Integer jobId;

    /**
     * 日志类型 1-新增 2-修改 3-启动 4-关闭 5-删除
     */
    private Integer logType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建时间
     */
    private String createTimeStr;

}
