package com.lee.springmvc.service;

import com.lee.springmvc.domain.BaseResp;
import com.lee.springmvc.domain.LoginInfo;
import com.lee.springmvc.domain.LogoutInfo;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
public interface AuthService {

    BaseResp login(LoginInfo loginInfo);

    BaseResp logout(LogoutInfo logoutInfo);
}
