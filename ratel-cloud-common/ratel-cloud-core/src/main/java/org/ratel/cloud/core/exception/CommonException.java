package org.ratel.cloud.core.exception;

/**
 * 非业务异常
 * 用于在处理非业务逻辑时，进行抛出的异常。
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 * @see Exception
 */
public class CommonException extends BaseCheckedException {


    public CommonException(int code, String message) {
        super(code, message);
    }

    public CommonException(int code, String format, Object... args) {
        super(code, format, args);
    }

    public CommonException wrap(int code, String format, Object... args) {
        return new CommonException(code, format, args);
    }

    @Override
    public String toString() {
        return "BizException [message=" + getMessage() + ", code=" + getCode() + "]";
    }
}
