package com.er.service;

import com.er.bean.Evalinfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EvalService {
    @Select("select * from evalinfo where gid=#{gid}")
    List<Evalinfo> selectEval(Integer gid);
    void evaladd(Evalinfo evalinfo);
}
