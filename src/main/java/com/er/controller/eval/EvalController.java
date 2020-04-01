package com.er.controller.eval;

import com.er.bean.Evalinfo;
import com.er.mapper.EvalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class EvalController {
    @Autowired
    private EvalMapper evalMapper;

    @RequestMapping("/evaladd")
    public String evaladd(Evalinfo evalinfo){
       // System.out.println(    evalinfo.getUid());

        evalinfo.setEdate(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(evalinfo.getEdate());
        evalinfo.setTime(format);
        evalMapper.evaladd(evalinfo);
        return "redirect:/selectSingle?gid="+evalinfo.getGid();
    }
}
