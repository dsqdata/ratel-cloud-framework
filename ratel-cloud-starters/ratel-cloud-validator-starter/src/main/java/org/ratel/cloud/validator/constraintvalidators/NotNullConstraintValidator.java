package org.ratel.cloud.validator.constraintvalidators;


import org.hibernate.validator.internal.constraintvalidators.bv.NotNullValidator;
import org.ratel.cloud.core.base.validation.IValidatable;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotNull;

/**
 * 自定义一个验证 NotNull 的校验器。自定义类需要实现IValidatable接口
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class NotNullConstraintValidator implements ConstraintValidator<NotNull, IValidatable> {

    private final NotNullValidator notNullValidator = new NotNullValidator();

    @Override
    public void initialize(NotNull parameters) {
        notNullValidator.initialize(parameters);
    }

    @Override
    public boolean isValid(IValidatable value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && value.value() != null;
    }
}
