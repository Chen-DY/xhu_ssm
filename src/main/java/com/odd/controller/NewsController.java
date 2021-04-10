package com.odd.controller;

import com.odd.service.NewsService;
import com.odd.service.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/news", method = {RequestMethod.GET})
public class NewsController {

    /**
     * @Autowired 加上这个注解之后，程序扫描到后，程序就会去IOC容器中找到对应类型的对象。找到之后直接给属性赋值
     *
     */
    @Autowired
    private NewsService newsService;

    @RequestMapping("/queryAll")
    public String queryAll() {
        System.out.println("表现层：queryAll");
        newsService.queryAllNews();
        return "list";
    }

    @GetMapping("/param01/{name}")
    @ResponseBody
    public String testParam01(@PathVariable("name") String name) {
        System.out.println("接收到" + name);
        return name;
    }
}
