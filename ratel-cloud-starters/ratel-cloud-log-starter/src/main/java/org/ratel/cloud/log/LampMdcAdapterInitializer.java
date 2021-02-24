package org.ratel.cloud.log;

import org.slf4j.LampMdcAdapter;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.lang.NonNull;

/**
 * 初始化TtlMDCAdapter实例，并替换MDC中的adapter对象
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class LampMdcAdapterInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(@NonNull ConfigurableApplicationContext applicationContext) {
        //加载TtlMDCAdapter实例
        LampMdcAdapter.getInstance();
    }
}
