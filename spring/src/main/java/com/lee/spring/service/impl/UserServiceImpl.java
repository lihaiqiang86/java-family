package com.lee.spring.service.impl;

import com.lee.spring.domain.UserInfo;
import com.lee.spring.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
@Component(value = "UserService")
public class UserServiceImpl implements UserService {

    private static final Log LOGGER = LogFactory.getLog(UserServiceImpl.class);

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
