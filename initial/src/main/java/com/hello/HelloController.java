package com.hello;

import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
//@Controller
public class HelloController {

    @Autowired
    HelloService helloService;
    
    @RequestMapping("/test")
    @ResponseBody
    public List index() {
         List<Map> list = helloService.selectUserList();
         return list;
    }
    
}
