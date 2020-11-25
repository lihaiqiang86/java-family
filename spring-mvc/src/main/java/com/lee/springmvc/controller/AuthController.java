package com.lee.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.lee.springmvc.domain.BaseResp;
import com.lee.springmvc.domain.LoginInfo;
import com.lee.springmvc.domain.LogoutInfo;
import com.lee.springmvc.service.AuthService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

    private static final Log LOGGER = LogFactory.getLog(AuthController.class);

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
