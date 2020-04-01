package com.er.controller.youxiafter;

import com.er.bean.Gameinfo;
import com.er.service.GameInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class YouxiAfter {
    //注入
    @Resource
    GameInfoService gameInfoService;

    //去后台游戏管理页面
    @RequestMapping("/toyouxi")/*/{pageNumber}*/
    public String AllGames(Model model) {/*,@RequestParam(value = "pageNumber",defaultValue = "1")Integer pageNumber*/
     /*   PageHelper.startPage(pageNumber,6);
        List<Gameinfo> gameinfos = gameInfoService.selectAll();
        PageInfo<Gameinfo> gameinfoPageInfo = new PageInfo<>(gameinfos);
        model.addAttribute("games",gameinfoPageInfo);
        System.out.println(gameinfoPageInfo);*/
        List<Gameinfo> gameinfos = gameInfoService.selectAll();
        model.addAttribute("games",gameinfos);
        int size=gameinfos.size();
        model.addAttribute("size",size);
        return "youxi/superuser/youxi-list";
    }


    //跳转修改用户页
    @RequestMapping("/toupdateUI")
    public String updateUI(Integer gid,Model model){
        Gameinfo gameinfo = gameInfoService.selectById(gid);
        model.addAttribute("gameinfo" ,gameinfo);
        return "youxi/superuser/youxi-edit";
    }
    //修改用户
    @RequestMapping("/toupdate")
    public String updateGames(Gameinfo gameinfo){
        Integer update = gameInfoService.updateGame(gameinfo);
        System.out.println(update);
        return "redirect:/toyouxi";
    }

    //根据gid删除一条数据
    @RequestMapping("/todeleteByid/{gid}")
    public String delete(@PathVariable("gid") Integer gid){
        int delete = gameInfoService.delete(gid);
        if (delete>0){
            System.out.println("删除成功");
        }
        return "redirect:/toyouxi";
    }
    //去游戏添加
    @RequestMapping("/tosaveUI")
    public String savegame(){
        return "youxi/superuser/youxi-add";
    }

    @RequestMapping("/tosave")
    public String saveUser(Gameinfo gameinfo){
        Date date = new Date();
        gameinfo.setGdate(date);
        int save = gameInfoService.savegame(gameinfo);
        System.out.println(save);
        return "redirect:/toyouxi";
    }


@RequestMapping("/qsc")
public String shancghaun(){
        return "youxi/superuser/youxi-sc";
}

    @RequestMapping("/fileUpload")
    public String fileUpload(MultipartFile filename) throws  Exception {
        System.out.println(filename.getOriginalFilename());
        filename.transferTo(new File("C:/youxi/src/main/resources/static/youxi/zhuye/images/thumbs/" + filename.getOriginalFilename()));
        System.out.println(filename);
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "文件上传成功");
        return "redirect:/toyouxi";
    }

}
