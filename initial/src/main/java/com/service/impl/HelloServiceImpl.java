package com.service.impl;

import com.mapper.UserMapper;
import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<Map> selectUserList() {
        return userMapper.selectUserList();
    }
}
