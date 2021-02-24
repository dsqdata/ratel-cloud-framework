package org.ratel.cloud.log.properties;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * 操作日志配置类
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@ConfigurationProperties(prefix = OptLogProperties.PREFIX)
@Data
@NoArgsConstructor
public class OptLogProperties {
    public static final String PREFIX = "lamp.log";

    /**
     * 是否启用
     */
    private Boolean enabled = true;

    /**
     * 日志存储类型
     */
    private OptLogType type = OptLogType.DB;
}
