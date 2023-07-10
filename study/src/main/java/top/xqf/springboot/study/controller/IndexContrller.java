package top.xqf.springboot.study.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexContrller {

    @GetMapping("")
    public String hello(String name)throws Exception{
        return String.format("欢迎：%s",name);
    }

    @RequestMapping("/demo.action")
    public String demo(String name)throws Exception{
        return String.format("欢迎：%s", StringUtils.hasText(name)?name.trim():"用户");
    }

}
