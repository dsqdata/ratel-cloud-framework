package org.ratel.cloud.security.config;


import lombok.AllArgsConstructor;
import org.ratel.cloud.security.aspect.UriSecurityPreAuthAspect;
import org.ratel.cloud.security.aspect.VerifyAuthFunction;
import org.ratel.cloud.security.feign.UserResolverService;
import org.ratel.cloud.security.properties.SecurityProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

/**
 * 权限认证配置类
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@Order
@AllArgsConstructor
@EnableConfigurationProperties({SecurityProperties.class})
public class SecurityConfiguration {
    private final SecurityProperties securityProperties;

    @Bean
    @ConditionalOnProperty(prefix = SecurityProperties.PREFIX, name = "enabled", havingValue = "true", matchIfMissing = true)
    public UriSecurityPreAuthAspect uriSecurityPreAuthAspect(VerifyAuthFunction verifyAuthFunction) {
        return new UriSecurityPreAuthAspect(verifyAuthFunction);
    }

    @Bean("fun")
    @ConditionalOnMissingBean(VerifyAuthFunction.class)
    public VerifyAuthFunction getVerifyAuthFunction(UserResolverService userResolverService) {
        return new VerifyAuthFunction(userResolverService, securityProperties);
    }

}
