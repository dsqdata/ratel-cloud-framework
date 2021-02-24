package org.ratel.cloud.cache.properties;

/**
 * 缓存类型
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public enum CacheType {
    /**
     * 内存
     */
    CAFFEINE,
    /**
     * redis
     */
    REDIS,
    ;

    public boolean eq(CacheType cacheType) {
        return cacheType != null && this.name().equals(cacheType.name());
    }
}
