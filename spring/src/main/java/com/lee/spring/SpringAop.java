package com.lee.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lihaiqiang
 * @since 2020/1/17
 */
@Aspect
@Component
public class SpringAop {

    private static final Log LOGGER = LogFactory.getLog(SpringAop.class);

    @Pointcut(value = "execution(* com.lee.spring.service.UserService.getUserInfo(..))")
    public void getUserInfo() {
    }

    @Before("getUserInfo()")
    public void notifyStart() {
        LOGGER.info("切点：开始获取用户信息");
    }

    @After("getUserInfo()")
    public void notifyEnd() {
        LOGGER.info("切点：结束获取用户信息");
    }
}
