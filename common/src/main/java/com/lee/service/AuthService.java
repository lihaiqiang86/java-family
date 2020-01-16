package com.lee.service;

import com.lee.domain.BaseResp;
import com.lee.domain.LoginInfo;
import com.lee.domain.LogoutInfo;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
public interface AuthService {

    BaseResp login(LoginInfo loginInfo);

    BaseResp logout(LogoutInfo logoutInfo);
}
