package com.er.service;

import com.er.bean.Gameinfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface GameInfoService {
    List<Gameinfo> selectAll();
    List<Gameinfo> selectAll1();
    Gameinfo selectById(Integer gid);

    Integer savegame(Gameinfo gameinfo);
    Integer updateGame(Gameinfo gameinfo);
    int delete(int gid);
}
