package com.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface HelloService {
    List<Map> selectUserList();
}
