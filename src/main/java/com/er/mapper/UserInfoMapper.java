package com.er.mapper;

import com.er.bean.Userinfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

//告诉springMVC这是一个mapper类
@Mapper
//讲mapper抽象类添加到bean中
@Component
public interface UserInfoMapper {
    //修改状态
    @Update("update userinfo set ustate=#{ustate} where uid=#{uid}")
    int updateState( Userinfo userInfo);
    //登录
    @Select("select * from userinfo where uname=#{uname} and upwd=#{upwd}")
    Userinfo login(@Param("uname") String uname, @Param("upwd") String upwd);
    //注册
    @Insert("insert into userinfo values(null,#{uname},#{upwd},#{uphone},#{urealname},#{ustyle},#{usex},#{uemail},#{uaddress},#{ucreatedate},#{ustate})")
    int save(Userinfo userInfo);
    //注册
    @Insert("insert into userinfo(uname,upwd,uphone,urealname,ustyle,usex,uemail,uaddress,ucreatedate,ustate) values(#{uname},#{upwd},#{uphone},#{urealname},#{ustyle},#{usex},#{uemail},#{uaddress},#{ucreatedate},#{ustate})")
    void add(Userinfo userinfo);
    //修改
    @Update("update userinfo set upwd=#{upwd},uphone=#{uphone},urealname=#{urealname},ustyle=#{ustyle},uemail=#{uemail},uaddress=#{uaddress} where uid=#{uid}")
    int update(Userinfo userInfo);

    //根据id查询
    @Select("select * from userinfo where uid=#{uid}")
    Userinfo findByid(int uid);
    //根据id查询
    @Select("select * from userinfo where uid=#{uid}")
    List<Userinfo> findByids(int uid);
    //根据用户id删除
    @Delete("delete from userinfo where uid=#{uid}")
    int delete(int uid);
    //根据用户查询
    @Select("select * from userinfo where ustyle=#{ustyle}")
    List<Userinfo> findByustyle(String ustyle);

    //模糊查询
    @Select("select * from userinfo where urealname like '%${urealname}%' and ustyle=#{ustyle}")
    List<Userinfo> findByName(@Param("urealname") String urealname ,@Param("ustyle")String ustyle);
    @Select("select * from userinfo where ucreatedate>#{startdate} and ucreatedate<#{enddate} and ustyle=#{ustyle}")
    List<Userinfo> findByUcreateDate(@Param("startdate") Date sartdate,@Param("enddate") Date enddate,@Param("ustyle")String ustyle);
    @Select("select * from userinfo where ucreatedate>#{startdate} and ucreatedate<#{enddate} and urealname like '%${urealname}%' and ustyle=#{ustyle}")
    List<Userinfo> findByDateAndName(@Param("startdate") Date sartdate,@Param("enddate") Date enddate ,@Param("urealname") String urealname,@Param("ustyle")String ustyle);




}
