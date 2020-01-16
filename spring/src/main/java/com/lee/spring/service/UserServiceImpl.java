package com.lee.spring.service;

import com.lee.domain.UserInfo;
import com.lee.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
@Component(value = "UserService")
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public UserInfo getUserInfo(String userName, String password) {
        LOGGER.info("Get user info: username=" + userName + ",password=" + password);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("1");
        userInfo.setNickname("Lee");
        userInfo.setUserName(userName);
        userInfo.setPhoneNumber("13611111111");
        return userInfo;
    }
}
