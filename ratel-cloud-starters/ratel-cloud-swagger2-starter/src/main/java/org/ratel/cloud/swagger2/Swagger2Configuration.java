package org.ratel.cloud.swagger2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * Swagger2 启动类. 参考： Knife4jAutoConfiguration
 * 启动条件：
 * 1，配置文件中： ${SwaggerProperties.PREFIX}.enable=true
 * 2，配置文件中不存在： ${SwaggerProperties.PREFIX}.enable 值
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@EnableSwagger2WebMvc
@ConditionalOnProperty(prefix = "knife4j", name = "enable", havingValue = Swagger2Configuration.TRUE, matchIfMissing = true)
@Import(BeanValidatorPluginsConfiguration.class)
public class Swagger2Configuration {

    public static final String TRUE = "true";

    @Bean
    @ConditionalOnClass(SwaggerWebMvcConfigurer.class)
    public SwaggerWebMvcConfigurer getSwaggerWebMvcConfigurer() {
        return new SwaggerWebMvcConfigurer();
    }

}
