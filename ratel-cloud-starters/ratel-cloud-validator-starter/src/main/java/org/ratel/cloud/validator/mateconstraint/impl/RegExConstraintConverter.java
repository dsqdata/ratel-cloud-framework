package org.ratel.cloud.validator.mateconstraint.impl;


import org.hibernate.validator.constraints.URL;
import org.ratel.cloud.validator.mateconstraint.IConstraintConverter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/**
 * 正则校验规则
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class RegExConstraintConverter extends BaseConstraintConverter implements IConstraintConverter {
    @Override
    protected String getType(Class<? extends Annotation> type) {
        return "regEx";
    }

    @Override
    protected List<Class<? extends Annotation>> getSupport() {
        return Arrays.asList(Pattern.class, Email.class, URL.class);
    }

    @Override
    protected List<String> getMethods() {
        return Arrays.asList("regexp", "message");
    }
}
