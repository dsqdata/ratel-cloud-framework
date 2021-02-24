package org.ratel.cloud.security.feign;


import org.ratel.cloud.core.base.R;
import org.ratel.cloud.core.context.ContextUtil;
import org.ratel.cloud.security.model.SysUser;

/**
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public interface UserResolverService {
    /**
     * 根据id查询用户
     *
     * @param id        用户id
     * @param userQuery 查询条件
     * @return 用户信息
     */
    R<SysUser> getById(Long id, UserQuery userQuery);

    /**
     * 查询当前用户的信息
     *
     * @param userQuery 查询条件
     * @return 用户信息
     */
    default R<SysUser> getById(UserQuery userQuery) {
        return this.getById(ContextUtil.getUserId(), userQuery);
    }
}
