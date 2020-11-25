package com.lee.spring.service;

import com.lee.spring.domain.UserInfo;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
public interface UserService {

    UserInfo getUserInfo(String userName, String password);
}
