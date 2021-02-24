package org.ratel.cloud.validator.constraintvalidators;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.internal.constraintvalidators.hv.LengthValidator;
import org.ratel.cloud.core.base.validation.IValidatable;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 自定义一个验证length的校验器。自定义类需要实现IValidatable接口
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class LengthConstraintValidator implements ConstraintValidator<Length, IValidatable> {

    private final LengthValidator lengthValidator = new LengthValidator();

    @Override
    public void initialize(Length parameters) {
        lengthValidator.initialize(parameters);
    }

    @Override
    public boolean isValid(IValidatable value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null || value.value() == null) {
            return true;
        }
        return lengthValidator.isValid(String.valueOf(value.value()), constraintValidatorContext);
    }
}
