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
import org.springframework.ui.Model;
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

    static {
        System.out.println("初始化：AuthController-1");
    }

    public AuthController() {
        System.out.println("初始化：AuthController-2");
    }

    @Autowired
    private AuthService authService;

    @RequestMapping("hello")
    public String helle(Model model) {
        LOGGER.info("Hello: request");
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

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
