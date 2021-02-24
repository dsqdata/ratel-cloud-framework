package org.ratel.cloud.security.properties;

/**
 * 调用用户信息的类型
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public enum UserType {
    /**
     * feign 远程调用
     */
    FEIGN,
    /**
     * Service 本地调用
     */
    SERVICE,
    ;
}
