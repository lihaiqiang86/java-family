package com.lee.springmvc.service;

import com.lee.springmvc.domain.UserInfo;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
public interface UserService {

    UserInfo getUserInfo(String userName, String password);
}
