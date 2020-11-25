package com.lee.spring.service.impl;

import com.alibaba.fastjson.JSON;
import com.lee.spring.domain.BaseResp;
import com.lee.spring.domain.LoginInfo;
import com.lee.spring.domain.LogoutInfo;
import com.lee.spring.domain.UserInfo;
import com.lee.spring.service.AuthService;
import com.lee.spring.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
@Component(value = "AuthService")
public class AuthServiceImpl implements AuthService {

    private static final Log LOGGER = LogFactory.getLog(AuthServiceImpl.class);

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
