package com.lee.springmvc;

import com.alibaba.fastjson.JSON;
import com.lee.springmvc.controller.AuthController;
import com.lee.springmvc.domain.LoginInfo;
import com.lee.springmvc.domain.LogoutInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author lihaiqiang
 * @since 2020/1/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-mvc-config-test.xml"})
public class SpringMVCTest {

    private static final Log LOGGER = LogFactory.getLog(AuthController.class);

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void hello() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/auth/hello")).andReturn();
        LOGGER.info("login: 结果=" + result.getModelAndView().toString());
    }

    @Test
    public void login() throws Exception {
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setUserName("lihaiqiang");
        loginInfo.setPassword("666666");
        String requestBody = JSON.toJSONString(loginInfo);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/auth/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody))
                .andReturn();
        LOGGER.info("login: 结果=" + result.getResponse().getContentAsString());
    }

    @Test
    public void logout() throws Exception {
        LogoutInfo logoutInfo = new LogoutInfo();
        logoutInfo.setUserName("lihaiqiang");
        logoutInfo.setPassword("666666");
        String requestBody = JSON.toJSONString(logoutInfo);
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/auth/logout")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody))
                .andReturn();
        LOGGER.info("logout: 结果=" + result.getResponse().getContentAsString());
    }
}
