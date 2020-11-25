package com.lee.spring.service;

import com.lee.spring.domain.BaseResp;
import com.lee.spring.domain.LoginInfo;
import com.lee.spring.domain.LogoutInfo;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
public interface AuthService {

    BaseResp login(LoginInfo loginInfo);

    BaseResp logout(LogoutInfo logoutInfo);
}
