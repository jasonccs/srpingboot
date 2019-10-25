package com.service.impl;

import com.mapper.UserMapper;
import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<Map> selectUserList(int start,int limit) {
        Map<String, Object> params = new HashMap<>();
        params.put("start", start);
        params.put("limit", limit);

//        Map<String, Object> result = new HashMap<>();
//        result.put("total", limit);
//        result.put("pages", Math.ceil((start-limit)/limit));
//        result.put("list",  userMapper.selectUserListMap(params));


        return userMapper.selectUserListMap(params);
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int insertUser(String name,int status) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        params.put("status", status);

       int t= userMapper.insertUser(params);


        return t;
    }



    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int deleteUser(String name,int status) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        params.put("status", status);

        int t= userMapper.deleteUser(params);


        return t;
    }



    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int updateUser(String name,int status) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        params.put("status", status);

        int t= userMapper.updateUser(params);

        return t;
    }
}
