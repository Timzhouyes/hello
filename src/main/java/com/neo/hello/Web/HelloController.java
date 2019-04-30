package com.neo.hello.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name){
        return  "hello world"+name+"Change already done";
    }

    @RequestMapping("/")
    public String index(ModelMap map)
    {
        map.addAttribute("message", "https://timzhouyes.github.io");
        return "hello";
    }
}
