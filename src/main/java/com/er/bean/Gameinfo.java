package com.er.bean;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

@Alias("gameInfo")
public class Gameinfo implements Serializable {
    private int gid;
    private String gname;
    private String gimg;
    private String gdetail;
    private String gtype;
    private Date gdate;
    private Float gprice;
    private String sj;
    private String gshiwan;
    private String gsingleimg;
    private String gfile;
    private String gjianjie;

    public String getGjianjie() {
        return gjianjie;
    }

    public void setGjianjie(String gjianjie) {
        this.gjianjie = gjianjie;
    }

    public String getGsingleimg() {
        return gsingleimg;
    }

    public void setGsingleimg(String gsingleimg) {
        this.gsingleimg = gsingleimg;
    }

    public String getGfile() {
        return gfile;
    }

    public void setGfile(String gfile) {
        this.gfile = gfile;
    }

    public String getGshiwan() {
        return gshiwan;
    }

    public void setGshiwan(String gshiwan) {
        this.gshiwan = gshiwan;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGimg() {
        return gimg;
    }

    public void setGimg(String gimg) {
        this.gimg = gimg;
    }

    public String getGdetail() {
        return gdetail;
    }

    public void setGdetail(String gdetail) {
        this.gdetail = gdetail;
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }

    public Date getGdate() {
        return gdate;
    }

    public void setGdate(Date gdate) {
        this.gdate = gdate;
    }

    public Float getGprice() {
        return gprice;
    }

    public void setGprice(Float gprice) {
        this.gprice = gprice;
    }

    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj;
    }
}
