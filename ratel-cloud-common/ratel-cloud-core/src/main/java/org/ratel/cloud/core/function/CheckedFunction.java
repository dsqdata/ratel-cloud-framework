package org.ratel.cloud.core.function;

/**
 * 处理异常的 函数
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@FunctionalInterface
public interface CheckedFunction<T, R> {
    /**
     * 执行
     *
     * @param t 入参
     * @return R 出参
     * @throws Exception 异常
     */
    R apply(T t) throws Exception;


}
