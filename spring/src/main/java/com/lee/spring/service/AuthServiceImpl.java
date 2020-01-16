package com.lee.spring.service;

import com.alibaba.fastjson.JSON;
import com.lee.domain.BaseResp;
import com.lee.domain.LoginInfo;
import com.lee.domain.LogoutInfo;
import com.lee.domain.UserInfo;
import com.lee.service.AuthService;
import com.lee.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
@Component(value = "AuthService")
public class AuthServiceImpl implements AuthService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthServiceImpl.class);

    @Autowired
    private UserService userService;

    @Override
    public BaseResp login(LoginInfo loginInfo) {
        LOGGER.info("Login: start, Login info=" + JSON.toJSONString(loginInfo));
        BaseResp resp = new BaseResp();
        UserInfo userInfo = userService.getUserInfo(loginInfo.getUserName(), loginInfo.getPassword());
        if (userInfo != null) {
            resp.setCode("0");
            resp.setDesc("Login success");
        } else {
            resp.setCode("1");
            resp.setDesc("User or password error");
        }
        LOGGER.info("Login: end, result=" + JSON.toJSONString(resp));
        return resp;
    }

    @Override
    public BaseResp logout(LogoutInfo logoutInfo) {
        LOGGER.info("Logout: start, Logout info=" + JSON.toJSONString(logoutInfo));
        BaseResp resp = new BaseResp();
        UserInfo userInfo = userService.getUserInfo(logoutInfo.getUserName(), logoutInfo.getPassword());
        if (userInfo != null) {
            resp.setCode("0");
            resp.setDesc("Logout success");
        } else {
            resp.setCode("1");
            resp.setDesc("User or password error");
        }
        LOGGER.info("Logout: end, result=" + JSON.toJSONString(resp));
        return resp;
    }
}
