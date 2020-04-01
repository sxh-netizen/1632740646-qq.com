package com.er;

import com.er.bean.Userinfo;
import com.er.mapper.UserInfoMapper;
import com.er.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
class ZhuchengxuApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UserInfoService userInfoService;

    @Test
    void contextLoads() {
        System.out.println(dataSource.getClass());
        Userinfo lisi = userInfoMapper.login("sxh", "123");
        System.out.println(lisi);
    }
    @Test
    void contextLoads1() {
        Userinfo lisi = userInfoService.login("lisi", "123");
        System.out.println(lisi);
    }
    @Test
    void contextLoads2() {
        List<Userinfo> list=userInfoMapper.findByustyle("用户");
        int size = list.size();
        System.out.println(size);
        System.out.println(list);
    }
   @Test
    void contextLoads3() throws ParseException{

        String start="2019-04-12";
        String end="2019-12-12";
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
           Date parse = sdf.parse(start);
       Date parse1 = sdf.parse(end);
       List<Userinfo> byUcreateDate = userInfoMapper.findByUcreateDate(parse, parse1,"用户");
       System.out.println(byUcreateDate);

   }
   @Test
    void contextLoads5() throws ParseException{

        String start="2019-04-12";
        String end="2019-12-12";
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
           Date parse = sdf.parse(start);
       Date parse1 = sdf.parse(end);
       List<Userinfo> byUcreateDate = userInfoMapper.findByDateAndName(parse, parse1,"ad","用户");
       System.out.println(byUcreateDate);

   }
   @Test
    void contextLoads4(){
       List<Userinfo> ad = userInfoMapper.findByName("ad","用户");
       System.out.println(ad);

   }

}
