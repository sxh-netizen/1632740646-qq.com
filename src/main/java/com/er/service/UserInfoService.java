package com.er.service;

import com.er.bean.Userinfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;


public interface UserInfoService {
    //登录
    Userinfo login(String uname, String upwd);
    //注册
    int save(Userinfo userInfo);
    //修改
    int update(Userinfo userInfo);
    //根据用户id删除
    int delete(int uid);
    //根据id查询
    Userinfo findByid(int uid);
    void add(Userinfo userinfo);

    List<Userinfo> findByustyle(String ustyle);

    int updateState( Userinfo userInfo);

    List<Userinfo> findByName(@Param("urealname") String urealname ,@Param("ustyle")String ustyle);
    List<Userinfo> findByUcreateDate(@Param("startdate") Date sartdate,@Param("enddate") Date enddate,@Param("ustyle")String ustyle);
    List<Userinfo> findByDateAndName(@Param("startdate") Date sartdate,@Param("enddate") Date enddate ,@Param("urealname") String urealname,@Param("ustyle")String ustyle);


}
