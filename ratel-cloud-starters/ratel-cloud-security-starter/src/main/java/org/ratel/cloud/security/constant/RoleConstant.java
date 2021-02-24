package org.ratel.cloud.security.constant;

/**
 * 系统默认角色
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public final class RoleConstant {
    private RoleConstant() {
    }

    public static final String SUPER_ADMIN = "SUPER_ADMIN";

    public static final String HAS_ROLE_ADMIN = "hasAnyRole('" + SUPER_ADMIN + "')";

    public static final String USER = "user";

    public static final String HAS_ROLE_USER = "hasAnyRole('" + USER + "')";

    public static final String TEST = "test";

    public static final String HAS_ROLE_TEST = "hasAnyRole('" + TEST + "')";

}
