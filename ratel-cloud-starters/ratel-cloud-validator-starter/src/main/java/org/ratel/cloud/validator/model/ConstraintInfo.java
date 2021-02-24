package org.ratel.cloud.validator.model;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * 检验约束信息
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@Data
@ToString
@Accessors(chain = true)
public class ConstraintInfo {
    /**
     * 约束对象的类型
     */
    private String type;
    /**
     * 约束属性
     */
    private Map<String, Object> attrs;

}
