package org.ratel.cloud.core.context;

import lombok.Data;

import java.io.Serializable;

/**
 * 线程变量封装的参数
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@Data
public class ThreadLocalParam implements Serializable {
    private Boolean boot;
    private String tenant;
    private Long userid;
    private String name;
    private String account;
}
