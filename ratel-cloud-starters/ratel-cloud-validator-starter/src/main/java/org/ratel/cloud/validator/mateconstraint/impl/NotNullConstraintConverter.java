package org.ratel.cloud.validator.mateconstraint.impl;


import org.ratel.cloud.validator.mateconstraint.IConstraintConverter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;


/**
 * 非空 转换器
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class NotNullConstraintConverter extends BaseConstraintConverter implements IConstraintConverter {


    @Override
    protected String getType(Class<? extends Annotation> type) {
        return "notNull";
    }

    @Override
    protected List<Class<? extends Annotation>> getSupport() {
        return Arrays.asList(NotNull.class, NotEmpty.class, NotBlank.class);
    }

    @Override
    protected List<String> getMethods() {
        return Arrays.asList("message");
    }
}
