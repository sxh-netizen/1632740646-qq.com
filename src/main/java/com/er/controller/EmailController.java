package com.er.controller;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

@Controller
public class EmailController {

    private String myemail="1606469703@qq.com";
    @Autowired
    private JavaMailSender mailSender;
    @RequestMapping("/send")
    public String Send(String title,String email,String context)throws Exception{

        MimeMessage message=mailSender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(message,true);
        helper.setSubject(title);
        helper.setText("<h3 style='color:#1bd1a5'>"+context+"</h3>",true);
        helper.setTo(email);
        helper.setFrom(myemail);
        mailSender.send(message);
        return "redirect:/";
    }

}
