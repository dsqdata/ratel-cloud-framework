package org.ratel.cloud.log.event;


import org.ratel.cloud.core.log.entity.OptLogDTO;
import org.springframework.context.ApplicationEvent;

/**
 * 系统日志事件
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class SysLogEvent extends ApplicationEvent {

    public SysLogEvent(OptLogDTO source) {
        super(source);
    }
}
