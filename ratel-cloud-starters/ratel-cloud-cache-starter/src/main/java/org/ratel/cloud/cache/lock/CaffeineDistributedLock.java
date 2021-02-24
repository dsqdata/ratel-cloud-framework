package org.ratel.cloud.cache.lock;


import org.ratel.cloud.core.lock.DistributedLock;

/**
 * 分布式锁 只能用redis实现
 * 写这个类的目的，只是为了防止代码启动报错
 *
 * @author Ratel-Cloud
 * @version 1.0
 * @date 2021/02/24
 */
public class CaffeineDistributedLock implements DistributedLock {
    @Override
    public boolean lock(String key, long expire, int retryTimes, long sleepMillis) {
        return true;
    }

    @Override
    public boolean releaseLock(String key) {
        return true;
    }
}
