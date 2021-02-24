package org.ratel.cloud.core.base.validation;

/**
 * 实现了此接口，表示此类将会支持验证框架。
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public interface IValidatable {

    /**
     * 此类需要检验什么值
     * 支持length长度检验。也可以看情况实现支持类似于email，正则等等校验
     *
     * @return 需要验证的值
     */
    Object value();
}
