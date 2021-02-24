package org.ratel.cloud.log;

import org.ratel.cloud.core.jackson.JsonUtil;
import lombok.AllArgsConstructor;
import org.ratel.cloud.log.aspect.SysLogAspect;
import org.ratel.cloud.log.event.SysLogListener;
import org.ratel.cloud.log.monitor.PointUtil;
import org.ratel.cloud.log.properties.OptLogProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 日志自动配置
 * <p>
 * 启动条件：
 * 1，存在web环境
 * 2，配置文件中lamp.log.enabled=true 或者 配置文件中不存在：lamp.log.enabled 值
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@EnableAsync
@Configuration
@AllArgsConstructor
@ConditionalOnWebApplication
@ConditionalOnProperty(prefix = OptLogProperties.PREFIX, name = "enabled", havingValue = "true", matchIfMissing = true)
public class LogAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public SysLogAspect sysLogAspect() {
        return new SysLogAspect();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnExpression("${lamp.log.enabled:true} && 'LOGGER'.equals('${lamp.log.type:LOGGER}')")
    public SysLogListener sysLogListener() {
        return new SysLogListener(log -> PointUtil.debug("0", "OPT_LOG", JsonUtil.toJson(log)));
    }
}
