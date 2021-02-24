package org.ratel.cloud.core.annotation.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 忽略全局响应包装
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface IgnoreResponseBodyAdvice {

}
