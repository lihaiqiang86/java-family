package com.lee.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.lee.domain.BaseResp;
import com.lee.domain.LoginInfo;
import com.lee.domain.LogoutInfo;
import com.lee.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lihaiqiang
 * @since 2020/1/19
 */
@Controller
@RequestMapping("auth/")
public class AuthController {

    private final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private AuthService authService;

    @RequestMapping("login")
    @ResponseBody
    public BaseResp login(@RequestBody(required = false) LoginInfo loginInfo) {
        LOGGER.info("Login: loginInfo=" + JSON.toJSONString(loginInfo));
        return authService.login(loginInfo);
    }

    @RequestMapping("logout")
    @ResponseBody
    public BaseResp logout(@RequestBody(required = false) LogoutInfo logoutInfo) {
        LOGGER.info("Logout: logoutInfo=" + JSON.toJSONString(logoutInfo));
        return authService.logout(logoutInfo);
    }
}
