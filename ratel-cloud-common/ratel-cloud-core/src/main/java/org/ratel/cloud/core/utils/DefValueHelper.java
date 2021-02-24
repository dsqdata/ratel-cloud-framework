package org.ratel.cloud.core.utils;

import cn.hutool.core.util.StrUtil;

import java.io.Serializable;

/**
 * 默认值
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public final class DefValueHelper {
    private DefValueHelper() {
    }

    public static String getOrDef(String val, String def) {
        return StrUtil.isEmpty(val) ? def : val;
    }

    public static <T extends Serializable> T getOrDef(T val, T def) {
        return val == null ? def : val;
    }

}
