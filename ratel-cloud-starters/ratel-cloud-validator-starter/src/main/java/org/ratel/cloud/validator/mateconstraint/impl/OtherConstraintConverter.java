package org.ratel.cloud.validator.mateconstraint.impl;


import org.ratel.cloud.validator.mateconstraint.IConstraintConverter;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 其他 转换器
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class OtherConstraintConverter extends BaseConstraintConverter implements IConstraintConverter {


    @Override
    protected String getType(Class<? extends Annotation> type) {
        return type.getSimpleName();
    }

    @Override
    protected List<Class<? extends Annotation>> getSupport() {
        return new ArrayList<>();
    }


    @Override
    protected List<String> getMethods() {
        return Arrays.asList("message");
    }
}
