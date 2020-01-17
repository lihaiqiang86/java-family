package com.lee.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author lihaiqiang
 * @since 2020/1/17
 */
@Aspect
@Component
public class SpringAop {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringAop.class);

    @Pointcut(value = "execution(* com.lee.service.UserService.getUserInfo(..))")
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
