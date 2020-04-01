package com.er.service.imp;

import com.er.bean.Evalinfo;
import com.er.service.EvalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EvalServiceImpl implements EvalService {
    @Autowired
    private EvalService evalService;
    @Override
    public List<Evalinfo> selectEval(Integer gid) {
        List<Evalinfo> evalinfos = evalService.selectEval(gid);
        return evalinfos;
    }

    @Override
    public void evaladd(Evalinfo evalinfo) {
        evalService.evaladd(evalinfo);
    }
}
