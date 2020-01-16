package com.lee.spring;

import com.lee.service.AuthService;
import com.lee.service.UserService;
import com.lee.spring.service.AuthServiceImpl;
import com.lee.spring.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lihaiqiang
 * @since 2020/1/15
 */
@Configuration
public class ManualConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManualConfig.class);

    @Bean(value = "AuthService")
    public AuthService getAuthService() {
        LOGGER.info("Init AuthService ===============================");
        return new AuthServiceImpl();
    }

    @Bean(value = "UserService")
    public UserService getUserService() {
        LOGGER.info("Init UserService ===============================");
        return new UserServiceImpl();
    }
}
