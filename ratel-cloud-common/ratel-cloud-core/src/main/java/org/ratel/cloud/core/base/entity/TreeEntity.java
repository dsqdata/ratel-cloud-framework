package org.ratel.cloud.core.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static com.baomidou.mybatisplus.annotation.SqlCondition.LIKE;

/**
 * 包括id、create_time、created_by、updated_by、update_time、label、parent_id、sort_value 字段的表继承的树形实体
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class TreeEntity<E, T extends Serializable> extends Entity<T> {

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    @NotEmpty(message = "名称不能为空")
    @Length(max = 255, message = "名称长度不能超过255")
    @TableField(value = "label", condition = LIKE)
    protected String label;

    /**
     * 父ID
     */
    @ApiModelProperty(value = "父ID")
    @TableField(value = "parent_id")
    protected T parentId;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序号")
    @TableField(value = "sort_value")
    protected Integer sortValue;


    @ApiModelProperty(value = "子节点", hidden = true)
    @TableField(exist = false)
    protected List<E> children;


    /**
     * 初始化子类
     */
    public void initChildren() {
        if (getChildren() == null) {
            this.setChildren(new ArrayList<>());
        }
    }
}
