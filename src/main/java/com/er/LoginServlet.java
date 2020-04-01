package com.er;

import com.baidu.aip.face.AipFace;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//@WebServlet("/loginServlet")  //      就是他  <url-pattern></url-pattern>
@Controller
public class LoginServlet  extends HttpServlet {


    @Override  // get post 一并都有
    @RequestMapping("/loginServlet")
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. dedao 图片 64编码

        String despath= req.getParameter("message");
        // 2.  用 百度提供的 方法 根据 base64编码 来 搜索 脸谱对比
        FaceSearch faceSearch= new FaceSearch();
        // 3. 得出对比 得分结果  .是就 登录  否就 不让登录
        String result = faceSearch.search(despath);
        System.out.println("result"+result);
        resp.getWriter().println(result);
    }
}
