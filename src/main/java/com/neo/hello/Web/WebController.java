package com.neo.hello.Web;

import com.neo.hello.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@RestController
//@Controller
public class WebController {

    @RequestMapping(name="/getUsers")
    public List<User> getUsers(){
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

    @PostMapping(name="/getUser")
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

    @RequestMapping("/saveUser")
    public void saveUser (@Valid User user, BindingResult result) {
        System.out.println("user:" + user);
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode() + "-" + error.getDefaultMessage());
            }
        }
    }
}
