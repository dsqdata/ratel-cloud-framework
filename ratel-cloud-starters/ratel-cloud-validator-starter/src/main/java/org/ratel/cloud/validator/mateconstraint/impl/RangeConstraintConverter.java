package org.ratel.cloud.validator.mateconstraint.impl;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.ratel.cloud.validator.mateconstraint.IConstraintConverter;

import javax.validation.constraints.Size;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/**
 * 长度 转换器
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class RangeConstraintConverter extends BaseConstraintConverter implements IConstraintConverter {

    @Override
    protected List<String> getMethods() {
        return Arrays.asList("min", "max", "message");
    }

    @Override
    protected String getType(Class<? extends Annotation> type) {
        return "range";
    }

    @Override
    protected List<Class<? extends Annotation>> getSupport() {
        return Arrays.asList(Length.class, Size.class, Range.class);
    }

}
