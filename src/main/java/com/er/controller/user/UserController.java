package com.er.controller.user;

import com.er.bean.Userinfo;
import com.er.service.UserInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    //引入用户的service
    @Autowired
    UserInfoService userInfoService;

   /* //跳转登录页面
    @RequestMapping("/loginUI")
    public String loginJsp(){
        return "youxi/user/login";
    }*/
//注册
    @RequestMapping("/zhuceadd")
    public String zhuceadd(Userinfo userinfo){
        Date date = new Date();
        userinfo.setUcreatedate(date);

        userInfoService.add(userinfo);
        return "youxi/superuser/login";
    }

    //进行登录
    @RequestMapping("/login")
    public String Login(String uname, String upwd, HttpSession session, /*String islogin,*/ HttpServletResponse response, Map<String,Object> map){
        Userinfo user = userInfoService.login(uname,upwd);
        //将查询出来的对象存在session
        session.setAttribute("user",user);
       /* System.out.println("用户"+user);*/
        //判断
        if(user != null){

           /* if (islogin != null){
               *//* Cookie unamecookie=new Cookie("uname",userInfo.getUname());
                Cookie upwdcookie=new Cookie("upwd",userInfo.getUpwd());
                unamecookie.setMaxAge(24*60*60);  //存期为一天
                upwdcookie.setMaxAge(24*60*60);  //存期为一天
                //防止用户名为中文，报错
                try {
                    URLEncoder.encode(userInfo.getUname(),"UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                unamecookie.setPath("/");
                upwdcookie.setPath("/");
                response.addCookie(unamecookie);
                response.addCookie(upwdcookie);*//*
            }*/

            //判断如果为超级管理员跳到后台
            //如果时普通跳到展示页面
            if (user.getUstate().equals("已启用")){
                if (user.getUstyle().equals("超级管理员")){
                    return "youxi/superuser/index";
                }else{
                    return "youxi/zhuye/index";
                }
            }else {
                map.put("meg","您的账户已被冻结");
                return "youxi/superuser/login";
            }
        }else {
            map.put("mag","用户或用户名错误");

            return "youxi/superuser/login";
        }


    }


    //跳转到用户列表页面
    @RequestMapping("/member-list")
    public String touserlist(Model model){
        List<Userinfo> yonghu =userInfoService.findByustyle("用户");
        model.addAttribute("yonghu",yonghu);
        int size = yonghu.size();
        model.addAttribute("size",size);
        return "youxi/superuser/member-list";
    }


    //跳转修改用户页
    @RequestMapping("/updateUI")
    public String updateUI(Integer uid,Model model){
        Userinfo userinfo = userInfoService.findByid(uid);
        model.addAttribute("userinfo",userinfo);
        Userinfo userinfo1 = (Userinfo) model.getAttribute("userinfo");
        return "youxi/superuser/member-edit";
    }
    //修改用户
    @RequestMapping("/update")
    public String updateUser(Userinfo userinfo){
        int update = userInfoService.update(userinfo);
        System.out.println(update);
        return "redirect:/member-list";
    }
    //跳转添加用户页
    @RequestMapping("/saveUI")
    public String saveUI(){
        return "youxi/superuser/member-add";
    }
    //添加用户
    @RequestMapping("/save")
    public String saveUser(Userinfo userinfo){
        Date date = new Date();
        userinfo.setUcreatedate(date);
        int save = userInfoService.save(userinfo);
        System.out.println(save);
        return "redirect:/member-list";
    }
    //退出账号
    @RequestMapping("/exit")
    public String exit(HttpSession session){
        session.invalidate();
        return "/youxi/superuser/login";
    }
    //不启用账号
    @RequestMapping("/tingyong/{uid}")
    public String weiqiyong(@PathVariable("uid") Integer uid){
        Userinfo yonghu = userInfoService.findByid(uid);
        yonghu.setUstate("未启用");
        userInfoService.updateState(yonghu);
        return "redirect:/member-list";
    }

    //启用账号
    @RequestMapping("/qiyong/{uid}")
    public String qiyong(@PathVariable("uid") Integer uid){
        Userinfo yonghu = userInfoService.findByid(uid);
        yonghu.setUstate("已启用");
        userInfoService.updateState(yonghu);
        return "redirect:/member-list";
    }
    //根据uid删除一条数据
    @RequestMapping("/deleteByid/{uid}")
    public String delete(@PathVariable("uid") Integer uid){
        int delete = userInfoService.delete(uid);
        if (delete>0){
            System.out.println("删除成功");
        }
        return "redirect:/member-list";
    }



    //模糊查询
    //路径
    @RequestMapping("/mohuchaxun/{startdate}&{enddate}&{urealname}")
    @ResponseBody
    public Map<String,Object> selectAll(@PathVariable("startdate") String startdate, @PathVariable("enddate")String enddate, @PathVariable("urealname")String urealname)throws ParseException {
        /*System.out.println(startdate);
        System.out.println(enddate);
        System.out.println(urealname);*/
        Map<String,Object> map=new HashMap<>();
        String ustyle="用户";
        Date start=null;
        Date end=null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        if (startdate!=null&&enddate!=null&&!"".equals(startdate)&&!"".equals(enddate)) {
            start = sdf.parse(startdate);
            end= sdf.parse(enddate);
        }
        //判断
        //1.当开始时间和截至时间不为空
        if (startdate!=null&&enddate!=null&&!"".equals(startdate)&&!"".equals(enddate)){
            List<Userinfo> byUcreateDate = userInfoService.findByUcreateDate(start, end,ustyle);
            map.put("users",byUcreateDate);
            return map;

        }else if (urealname!=null){//2.当昵称不为空
            System.out.println(222);
            List<Userinfo> userinfo1 = userInfoService.findByName(urealname,ustyle);
            map.put("users",userinfo1);
            return map;
        }else if(urealname!=null&&startdate!=null&&enddate!=null&&!"".equals(startdate)&&!"".equals(enddate)&&!"".equals(urealname)){//3.当开始时间和截至时间和昵称不为空
            List<Userinfo> byDateAndName = userInfoService.findByDateAndName(start, end, urealname, ustyle);
            map.put("users",byDateAndName);
            return map;
        }else if(startdate==null&&urealname==null&&enddate==null&&"".equals(startdate)&&"".equals(enddate)&&"".equals(urealname)){//4.当全部都为空的
            List<Userinfo> byustyle = userInfoService.findByustyle(ustyle);
            map.put("users",byustyle);
            System.out.println(4444);
            System.out.println(map);
            return map;
        }
        return null;

    }






}
