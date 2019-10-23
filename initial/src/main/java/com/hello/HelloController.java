package com.hello;

import com.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@RestController
//@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/test")
    @ResponseBody
//    public Map<String,Object> index(@RequestParam(value = "page", required = false,defaultValue="0") int page, @RequestParam(value = "limit", required = false,defaultValue="10")  int limit) {
    public Map<String, Object> index(Page page) {



        int start = ((page.getPage()<=1?1:page.getPage() )- 1) * page.getLimit();


        List<Map> list = helloService.selectUserList(start, page.getLimit());


        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("total", page.getLimit());
        map1.put("pages", page.getPage());
        map1.put("list", list);

        map.put("code", 0);
        map.put("msg", "百度");
        map.put("data", map1);
        return map;
    }

}
