package com.neo.hello.Web;

import com.neo.hello.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@Controller
public class WebController {

    @RequestMapping(value="/changeWholeName")
    public List<User> changeWholeName(){
        List<User> users =new ArrayList<User>();
        User user1=new User();
        user1.setName("mint1");
        user1.setAge(19);
        user1.setPass("123456");
        users.add(user1);
        User user2=new User();
        user2.setName("mint3");
        user2.setAge(192);
        user2.setPass("1234516");
        users.add(user2);
        return users;
    }

    @PostMapping(value="/getUser123")
    public User getUser(){
        User user=new User();
        user.setName("mint");
        user.setAge(19);
        user.setPass("123456");
        return user;
    }


    @RequestMapping(value="get/{name}",method=RequestMethod.GET)
    public String get(@PathVariable String name)
    {
        return name;
    }

}