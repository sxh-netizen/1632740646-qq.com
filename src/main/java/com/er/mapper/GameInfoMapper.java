package com.er.mapper;

import com.er.bean.Gameinfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface GameInfoMapper {
    //查询所有游戏
    @Select("select * from gameinfo")
    List<Gameinfo> selectAll();


    @Select(" select * from gameinfo ORDER BY #{gname} desc")
    List<Gameinfo> selectAll1();
    //查询单个游戏详细
    @Select("select * from gameinfo where gid = #{gid}")
    Gameinfo selectById(Integer gid);
    //模糊查询
    @Select("select * from gameinfo where gname like #{gname} ")
    List<Gameinfo> selectLikeGame(@Param("gname")String gname);
    //修改游戏信息
    @Update("update gameinfo set gprice=#{gprice},gshiwan=#{gshiwan} where gid=#{gid}")
    Integer updateGame(Gameinfo gameinfo);
    //添加游戏
    @Insert("insert into gameinfo values(#{gid},#{gname},#{gdetail},#{gimg},#{gtype},#{gdate},#{gprice},#{gshiwan},#{gsingleimg},#{gfile},#{gjianjie})")
    Integer savegame(Gameinfo gameinfo);
    //根据游戏id删除
    @Delete("delete from gameinfo where gid=#{gid}")
    int delete(int gid);
}
