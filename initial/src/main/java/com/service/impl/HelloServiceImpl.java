package com.service.impl;

import com.mapper.UserMapper;
import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

//        System.out.println(params);
        return userMapper.selectUserListMap(params);
    }
}
