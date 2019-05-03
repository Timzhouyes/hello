package com.neo.hello.Web;

import com.neo.hello.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ExampleController {

    private List<User> getUserList(){
        List<User> list=new ArrayList<User>();
        User user1=new User("A1",13,"1234567");
        User user2=new User("A2",14,"4321234");
        User user3=new User("A3",19,"0933211");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }
    @RequestMapping("/string")
    public String string(ModelMap map)
    {
        map.addAttribute("username", "Mint");
        return "string";
    }

    @RequestMapping("/if")
    public String ifunless(ModelMap map)
    {
        map.addAttribute("flag","yes");
        return "if";
    }

    @RequestMapping("/list")
    public String list(ModelMap map)
    {
        map.addAttribute("users",getUserList());
        return "list";
    }

    @RequestMapping("/url")
    public String url(ModelMap map)
    {
        map.addAttribute("type","link");
        map.addAttribute("pageId","springcloud/2017/09/11/");
        map.addAttribute("img","http://www.ityouknow.com/assets/images/neo.jpg");
        return "url";
    }
    @RequestMapping("/Sanmu")
    public String Sanmu(ModelMap map)
    {
        map.addAttribute("name","neo");
        map.addAttribute("age",90);
        map.addAttribute("flag","yes");
        return "eq";
    }

    @RequestMapping("/switch")
    public String Switch(ModelMap map){
        map.addAttribute("sex","woman1");
        return "switch";
    }
    @RequestMapping("/inline")
    public String Inline(ModelMap map)
    {
        map.addAttribute("username", "Jetty");
        return "inline";
    }

    @RequestMapping("/object")
    public String object(HttpServletRequest request)
    {
        request.setAttribute("request","I am a monster request");
        request.getSession().setAttribute("session","I am a session");
//        request.loca
        return "object";
    }

    @RequestMapping("/utility")
    public String utility(ModelMap map)
    {
        map.addAttribute("date",new Date());

        return "utility";
    }
}

















