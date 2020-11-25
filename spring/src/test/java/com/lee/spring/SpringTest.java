package com.lee.spring;

import com.alibaba.fastjson.JSON;
import com.lee.spring.domain.BaseResp;
import com.lee.spring.domain.LoginInfo;
import com.lee.spring.domain.LogoutInfo;
import com.lee.spring.service.AuthService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lihaiqiang
 * @since 2020/1/15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoConfig.class)
//@ContextConfiguration(classes = ManualConfig.class)
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringTest {

    private static final Log LOGGER = LogFactory.getLog(SpringTest.class);

    @Autowired
    private AuthService authService;

    @Test
    public void login() {
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setUserName("lihaiqiang");
        loginInfo.setPassword("123456");
        BaseResp resp = authService.login(loginInfo);
        LOGGER.info("login: 结果=" + JSON.toJSONString(resp));
    }

    @Test
    public void logout() {
        LogoutInfo logoutInfo = new LogoutInfo();
        logoutInfo.setUserName("lihaiqiang");
        logoutInfo.setPassword("123456");
        BaseResp resp = authService.logout(logoutInfo);
        LOGGER.info("logout: 结果=" + JSON.toJSONString(resp));
    }
}
