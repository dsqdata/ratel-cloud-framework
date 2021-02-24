package org.ratel.cloud.cache;

import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ratel.cloud.cache.lock.CaffeineDistributedLock;
import org.ratel.cloud.cache.properties.CustomCacheProperties;
import org.ratel.cloud.cache.repository.CacheOps;
import org.ratel.cloud.cache.repository.CachePlusOps;
import org.ratel.cloud.cache.repository.impl.CaffeineOpsImpl;
import org.ratel.cloud.core.lock.DistributedLock;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;


/**
 * 内存缓存配置
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
@Slf4j
@ConditionalOnProperty(prefix = CustomCacheProperties.PREFIX, name = "type", havingValue = "CAFFEINE")
@EnableConfigurationProperties({CustomCacheProperties.class})
@RequiredArgsConstructor
public class CaffeineAutoConfigure {

    private final CustomCacheProperties cacheProperties;

    /**
     * 为了解决演示环境启动报错而加的类
     */
    @Bean
    @ConditionalOnMissingBean
    public DistributedLock caffeineDistributedLock() {
        return new CaffeineDistributedLock();
    }

    /**
     * caffeine 持久库
     *
     * @return the redis repository
     */
    @Bean
    @ConditionalOnMissingBean
    public CacheOps cacheOps() {
        return new CaffeineOpsImpl();
    }

    /**
     * caffeine 增强持久库
     * 仅用于避免报错， 正式环境请勿使用
     *
     * @return the redis repository
     */
    @Bean
    @ConditionalOnMissingBean
    public CachePlusOps cachePlusOps() {
        return new CaffeineOpsImpl();
    }

    @SuppressWarnings("AlibabaRemoveCommentedCode")
    @Bean
    @Primary
    public CacheManager caffeineCacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();

        Caffeine caffeine = Caffeine.newBuilder()
                .recordStats()
                .initialCapacity(500)
                .expireAfterWrite(cacheProperties.getDef().getTimeToLive())
                .maximumSize(cacheProperties.getDef().getMaxSize());
        cacheManager.setAllowNullValues(cacheProperties.getDef().isCacheNullValues());
        cacheManager.setCaffeine(caffeine);

        //配置了这里，就必须事先在配置文件中指定key 缓存才生效
//        Map<String, CustomCacheProperties.Redis> configs = cacheProperties.getConfigs();
//        Optional.ofNullable(configs).ifPresent((config)->{
//            cacheManager.setCacheNames(config.keySet());
//        });
        return cacheManager;
    }

}

