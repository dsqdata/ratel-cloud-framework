package org.ratel.cloud.validator.extract;


import org.ratel.cloud.validator.model.FieldValidatorDesc;
import org.ratel.cloud.validator.model.ValidConstraint;

import java.util.Collection;
import java.util.List;


/**
 * 提取指定表单验证规则
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public interface IConstraintExtract {

    /**
     * 提取指定表单验证规则
     *
     * @param constraints 限制条件
     * @return 验证规则
     * @throws Exception 异常
     */
    Collection<FieldValidatorDesc> extract(List<ValidConstraint> constraints) throws Exception;
}
