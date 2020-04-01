package com.er.service.imp;

import com.er.bean.Gameinfo;
import com.er.mapper.GameInfoMapper;
import com.er.service.GameInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

//告诉springMVC这是一个service类
@Service
public class GameInfoServiceImp implements GameInfoService {
    @Autowired
    private GameInfoMapper gameInfoMapper;
    @Override
    public List<Gameinfo> selectAll() {
        return gameInfoMapper.selectAll();
    }

    @Override
    public List<Gameinfo> selectAll1() {
        return gameInfoMapper.selectAll1();
    }

    @Override
    public Gameinfo selectById(Integer gid) {
        return gameInfoMapper.selectById(gid);
    }

    @Override
    public Integer updateGame(Gameinfo gameinfo) {
        return gameInfoMapper.updateGame(gameinfo);
    }

    @Override
    public Integer savegame(Gameinfo gameinfo) {
        return gameInfoMapper.savegame(gameinfo);
    }

    @Override
    public int delete(int gid) {
        return gameInfoMapper.delete(gid);
    }

}
