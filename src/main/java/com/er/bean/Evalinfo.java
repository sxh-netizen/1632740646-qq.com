package com.er.bean;

import java.util.Date;

public class Evalinfo {
    private int eid;
    private int uid;
    private int gid;
    private String econtent;
    private Date edate;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getEcontent() {
        return econtent;
    }

    public void setEcontent(String econtent) {
        this.econtent = econtent;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    @Override
    public String toString() {
        return "Evalinfo{" +
                "eid=" + eid +
                ", uid=" + uid +
                ", gid=" + gid +
                ", econtent='" + econtent + '\'' +
                ", edate=" + edate +
                '}';
    }
}
