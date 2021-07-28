package com.Chapter3.ch13.domain.userinfo.dao;

import com.Chapter3.ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
}
