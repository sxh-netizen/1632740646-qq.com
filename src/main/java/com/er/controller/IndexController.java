package com.er.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //跳转到主页
    @RequestMapping("/")
    public String Index(){
        return "youxi/zhuye/index";
    }
   //跳转到games页面
    @RequestMapping("/games")
    public String games(){
        return "youxi/zhuye/games";
    }
    //跳转到404
    @RequestMapping("/404")
    public String Byid(){
        return "youxi/zhuye/404";
    }
   //跳转到特效页面
    @RequestMapping("/xuehua")
    public String jsp(){
        return "youxi/zhuye/xuehua";
    }
  //跳转到reviews页面
    @RequestMapping("/reviews")
    public String reviews(){
        return "youxi/zhuye/reviews";
    }
    //跳转到功夫鸡
    @RequestMapping("/gongfuji")
    public String gongfuji(){
        return "youxi/jsgame/gongfuji";
    }

    @RequestMapping("/tkdz")
    public String tkdz(){
        return "youxi/jsgame/index";
    }

    @RequestMapping("/mla")
    public String mla(){
        return "youxi/jsgame/mla";
    }

    @RequestMapping("/cdr")
    public String cdr(){
        return "youxi/jsgame/cdr";
    }

    //跳转到reviews页面
    @RequestMapping("/blog")
    public String blog(){
        return "youxi/zhuye/blog";

    }
    //跳转到reviews页面
    @RequestMapping("/contact")
    public String contact(){
        return "youxi/zhuye/contact";
    }
    //跳转到single页面
    /*@RequestMapping("/single")
    public String single(){
        return "youxi/zhuye/single";
    }*/

    @RequestMapping("/xiazai")
    public String face(){
        return "youxi/zhuye/xiazai";
    }
    //跳转到超级管理员页面
    @RequestMapping("/tologin")
    public String superuser(){
        return "youxi/superuser/login";
    }
   //跳转到超级管理员页面
    @RequestMapping("/index")
    public String index(){
        return "youxi/superuser/index";
    }


    @RequestMapping("/zhuce")
    public String zhuce(){
        return "youxi/superuser/zhuce";
    }

    @RequestMapping("/zhuce1")
    public String zhuce1(){
        return "youxi/superuser/zhuce1";
    }

}
