package org.ratel.cloud.validator.constraintvalidators;


import org.hibernate.validator.internal.constraintvalidators.bv.notempty.NotEmptyValidatorForCharSequence;
import org.ratel.cloud.core.base.validation.IValidatable;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotEmpty;

/**
 * 自定义一个验证 NotEmpty 的校验器。自定义类需要实现IValidatable接口
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class NotEmptyConstraintValidator implements ConstraintValidator<NotEmpty, IValidatable> {

    private final NotEmptyValidatorForCharSequence notEmptyValidator = new NotEmptyValidatorForCharSequence();

    @Override
    public void initialize(NotEmpty parameters) {
        notEmptyValidator.initialize(parameters);
    }

    @Override
    public boolean isValid(IValidatable value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && value.value() != null && !"".equals(value.value());
    }
}
