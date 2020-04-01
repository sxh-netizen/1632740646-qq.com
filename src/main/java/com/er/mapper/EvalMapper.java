package com.er.mapper;

import com.er.bean.Evalinfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface EvalMapper {
    @Select("select * from evalinfo where gid=#{gid}")
    List<Evalinfo> selectEval(Integer gid);
    @Insert("insert into evalinfo (uid,gid,econtent,edate) values(#{uid},#{gid},#{econtent},#{edate})")
    void evaladd(Evalinfo evalinfo);
}
