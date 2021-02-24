package org.ratel.cloud.swagger2;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Swagger 配置
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class SwaggerWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars" +
                "*")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
