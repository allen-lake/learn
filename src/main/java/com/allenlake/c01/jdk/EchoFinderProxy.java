package com.allenlake.c01.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;

/**
 * 发现方法名中出现echo子串, 给出提醒日志。
 *
 * @author ningbo.zhao
 * @since 2018年04月01日
 */
public class EchoFinderProxy {

    private static final Logger LOGGER = LoggerFactory.getLogger(EchoFinderProxy.class);

    public Object getProxy(Object target, Class<?>[] interfaces) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                interfaces, (proxy, method, args) -> {
                    LOGGER.info("proxy: {}, method: {}, args: {}", proxy, method, args);
                    if (method.getName().contains("echo")) {
                        LOGGER.warn("find `*echo*` invoke");
                    }
                    Object invoke = method.invoke(target, args);
                    LOGGER.info("invoke: {}", invoke);

                    return invoke;
                });
    }
}
