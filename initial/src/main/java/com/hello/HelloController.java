package com.hello;

import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/test")
    @ResponseBody
    public Map<String,Object> index(@RequestParam int page, @RequestParam int limit) {


        List<Map> list = helloService.selectUserList();


        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("total", limit);
        map1.put("pages", page);
        map1.put("list", list);

        map.put("code", 0);
        map.put("msg", "百度");
        map.put("data", map1);
        return map;
    }

}
