package org.ratel.cloud.log.properties;

/**
 * 日志类型
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public enum OptLogType {
    /**
     * 通过logger记录日志到本地
     */
    LOGGER,
    /**
     * 记录日志到数据库
     */
    DB,
    ;
}
