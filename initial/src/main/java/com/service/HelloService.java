package com.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface HelloService {
    List<Map> selectUserList(int start,int limit);

    int insertUser(String name,int status);


    int deleteUser(String name,int status);

    int updateUser(String name,int status);
}
