package com.hello;

import com.common.CommonHandel;
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
public class HelloController extends CommonHandel {

    @Autowired
    HelloService helloService;

    /**
     *  查询
     * @param page
     * @return
     */
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

    /**
     * 增加数据
     * @param name
     * @param status
     * @return
     */
    @GetMapping("/test2")
    @ResponseBody
    public Map<String, Object> index2(@RequestParam(value = "name", required = false,defaultValue="宝安区") String name, @RequestParam(value = "status", required = false,defaultValue="10")  int status) {


        int result = helloService.insertUser(name, status);

        return this.success(0,"新增成功");
    }


    /**
     * 删除
     * @param name
     * @param status
     * @return
     */
    @GetMapping("/test3")
    @ResponseBody
    public Map<String, Object> index3(@RequestParam(value = "name", required = false,defaultValue="宝安区") String name, @RequestParam(value = "status", required = false,defaultValue="10")  int status) {


        int result = helloService.deleteUser(name, status);

        return this.success(result,"新增成功");
    }


    /**
     * 更新数据
     * @param name
     * @param status
     * @return
     */
    @GetMapping("/test4")
    @ResponseBody
    public Map<String, Object> index4(@RequestParam(value = "name", required = false,defaultValue="宝安区") String name, @RequestParam(value = "status", required = false,defaultValue="10")  int status) {


        int result = helloService.updateUser(name, status);

        return this.success(result,"更新成功");
    }
}
