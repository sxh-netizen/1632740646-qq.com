package com.er.controller.game;

import com.er.bean.Evalinfo;
import com.er.bean.Gameinfo;
import com.er.mapper.EvalMapper;
import com.er.mapper.GameInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.List;
@Controller
public class GameInfoController {
    @Autowired
    private GameInfoMapper gameDAO;
    @Autowired
    private EvalMapper evalService;

    //展示所有游戏
    @RequestMapping(value = "/selectAll")
    @ResponseBody
    public List<Gameinfo> selectAll(){
        List<Gameinfo> games = gameDAO.selectAll();
        List<Gameinfo> games1 = games.subList(0, 12);
        return games1;
    }
//展示评价
    @RequestMapping(value = "/selectAlldesc")
    @ResponseBody
    public List<Gameinfo> selectAll1(){
        List<Gameinfo> games1 = gameDAO.selectAll1();
        return games1;
    }

    //展示游戏详情
    @RequestMapping("/selectById")
    public String selectById(Integer gid, HttpServletRequest request, HttpSession session){
        Gameinfo game = gameDAO.selectById(gid);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(game.getGdate());
        game.setSj(format);
        session.setAttribute("game",game);
        return "/youxi/zhuye/404";
    }


    @RequestMapping("/mohu")
    @ResponseBody
    public List<Gameinfo> muhu(String gname){
        System.out.println(gname);;
        gname="%"+gname+"%";

        List<Gameinfo> gameinfos =
                gameDAO.selectLikeGame(gname);

       // System.out.println(gameinfos);
        return gameinfos;
    }
    @RequestMapping( value = "/download", method = RequestMethod.GET )
    public void testDownload( HttpServletResponse res,String gfile ) {
        String fileName = gfile;

        res.setHeader("content-type", "application/octet-stream");
        res.setContentType("application/octet-stream");
        res.setHeader("Content-Disposition", "attachment; filename=" + fileName);
        byte[] buff = new byte[1024];
        BufferedInputStream bis = null;
        OutputStream os = null;

        try {
            os = res.getOutputStream();
            bis = new BufferedInputStream(new FileInputStream(
                    new File("C://" + fileName )));
            int i = bis.read(buff);

            while (i != -1) {
                os.write(buff, 0, buff.length);
                os.flush();
                i = bis.read(buff);
            }
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("export file finish");
    }

    //评价
    Gameinfo gameSingle=null;
    @RequestMapping(value = "/selectSingle")
    public String selectSingle(Integer gid,HttpServletRequest request){
        gameSingle = gameDAO.selectById(gid);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(gameSingle.getGdate());
        gameSingle.setSj(format);
        request.setAttribute("gameSingle",gameSingle);
        List<Evalinfo> evalinfos = evalService.selectEval(gameSingle.getGid());
        request.setAttribute("count",evalinfos.size());
        return "/youxi/zhuye/single";
    }
    @RequestMapping("/selectEval")
    @ResponseBody
    public List<Evalinfo> selectEval(Model model, HttpServletRequest request){
        List<Evalinfo> evalinfos = evalService.selectEval(gameSingle.getGid());
        //System.out.println("evalinfos="+evalinfos);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < evalinfos.size(); i++) {
            Evalinfo eval = evalinfos.get(i);
            String time = sdf.format(eval.getEdate());
            eval.setTime(time);
        }
        return evalinfos;
    }


}


