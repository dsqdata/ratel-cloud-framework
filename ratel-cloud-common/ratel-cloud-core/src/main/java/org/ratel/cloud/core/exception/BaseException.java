package org.ratel.cloud.core.exception;

/**
 * 异常接口类
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public interface BaseException {

    /**
     * 统一参数验证异常码
     */
    int BASE_VALID_PARAM = -9;

    /**
     * 返回异常信息
     *
     * @return 异常信息
     */
    String getMessage();

    /**
     * 返回异常编码
     *
     * @return 异常编码
     */
    int getCode();

}
