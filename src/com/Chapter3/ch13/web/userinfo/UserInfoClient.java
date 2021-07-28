package com.Chapter3.ch13.web.userinfo;

import com.Chapter3.ch13.domain.userinfo.UserInfo;
import com.Chapter3.ch13.domain.userinfo.dao.UserInfoDao;
import com.Chapter3.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import com.Chapter3.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties properties = new Properties();
        properties.load(fis);

        String dbType = properties.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("1234");
        userInfo.setPassword("!@#$");
        userInfo.setUserName("LEE");

        UserInfoDao userInfoDao = null;
        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("DB ERROR");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
    }
}
