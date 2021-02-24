package org.ratel.cloud.core.exception;

import org.ratel.cloud.core.exception.code.BaseExceptionCode;

/**
 * 无权限异常
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class ForbiddenException extends BaseUncheckedException {

    private static final long serialVersionUID = 1L;

    public ForbiddenException(int code, String message) {
        super(code, message);
    }

    public static ForbiddenException wrap(BaseExceptionCode ex) {
        return new ForbiddenException(ex.getCode(), ex.getMsg());
    }

    @Override
    public String toString() {
        return "ForbiddenException [message=" + getMessage() + ", code=" + getCode() + "]";
    }

}
