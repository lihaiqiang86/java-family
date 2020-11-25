package com.lee.spring;

import com.lee.spring.service.AuthService;
import com.lee.spring.service.UserService;
import com.lee.spring.service.impl.AuthServiceImpl;
import com.lee.spring.service.impl.UserServiceImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lihaiqiang
 * @since 2020/1/15
 */
@Configuration
public class ManualConfig {

    private static final Log LOGGER = LogFactory.getLog(AuthServiceImpl.class);

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
