package com.er.service.imp;

import com.er.bean.Userinfo;
import com.er.mapper.UserInfoMapper;
import com.er.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

//定义缓存组件中的名字
@CacheConfig(cacheNames = "user")
//告诉springMVC这是一个service类
@Service
public class UserInfoServiceImp implements UserInfoService {
    //引入mapper抽象类
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public int updateState(Userinfo userInfo) {
        return userInfoMapper.updateState(userInfo);
    }

    @Override
    public  void add(Userinfo userinfo) {
        userInfoMapper.add(userinfo);
    }


    //注入缓存的条件
 /*  @Caching(
           cacheable = {
                   @Cacheable(key = "#uname"),
                   @Cacheable(key = "#upwd")
           }
   )*/
    //登录
    @Override
    public Userinfo login(String uname, String upwd) {
        Userinfo login = userInfoMapper.login(uname, upwd);
        /* System.out.println("service"+login);*/
        return login;
    }

    //注册

    @Override
    public int save(Userinfo userInfo) {
        return userInfoMapper.save(userInfo);
    }

    @Override
    public List<Userinfo> findByUcreateDate(Date sartdate, Date enddate,String ustyle) {
        return userInfoMapper.findByUcreateDate(sartdate,enddate,ustyle);
    }

    @Override
    public List<Userinfo> findByDateAndName(Date sartdate, Date enddate, String urealname,String ustyle) {
        return userInfoMapper.findByDateAndName(sartdate,enddate,urealname,ustyle);
    }

    @Override
    public List<Userinfo> findByName(String urealname,String ustyle) {
        return userInfoMapper.findByName(urealname,ustyle);
    }

    @Override
    public int delete(int uid) {
        return userInfoMapper.delete(uid);
    }

    //注入缓存的条件
    //@CachePut  先执行方法，在存到缓存里
    /* @CachePut(key = "#userInfo.uid")*/
    //修改
    @Override
    public int update(Userinfo userInfo) {
        return userInfoMapper.update(userInfo);
    }

    //根据普通用户查询
    @Override
    public List<Userinfo> findByustyle(String ustyle) {
        return  userInfoMapper.findByustyle(ustyle);
    }

    //注入缓存的条件
    //先执行方法，在存到缓存里
    /*@Cacheable(key = "#uid")*/
    //根据id查询，单个查询
    @Override
    public Userinfo findByid(int uid) {
        return userInfoMapper.findByid(uid);
    }
}
