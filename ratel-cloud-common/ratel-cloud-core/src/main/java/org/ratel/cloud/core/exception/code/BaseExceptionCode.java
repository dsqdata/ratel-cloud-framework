package org.ratel.cloud.core.exception.code;

/**
 * 异常编码
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public interface BaseExceptionCode {
    /**
     * 异常编码
     *
     * @return 异常编码
     */
    int getCode();

    /**
     * 异常消息
     *
     * @return 异常消息
     */
    String getMsg();
}
