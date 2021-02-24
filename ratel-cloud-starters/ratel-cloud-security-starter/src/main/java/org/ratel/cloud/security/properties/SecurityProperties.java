package org.ratel.cloud.security.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@Data
@ConfigurationProperties(prefix = SecurityProperties.PREFIX)
public class SecurityProperties {
    public static final String PREFIX = "lamp.security";
    /**
     * 是否启用uri权限
     */
    private Boolean enabled = true;
    /**
     * 查询用户信息的调用方式
     */
    private UserType type = UserType.FEIGN;
    /**
     * 权限是否区分大小写
     */
    private Boolean caseSensitive = false;
}
