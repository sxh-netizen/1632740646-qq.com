package com.er.bean;

import java.util.Date;

public class Userinfo {
    private Integer uid;
    private String uname;
    private String upwd;
    private String urealname;
    private String ustyle;
    private int usex;
    private String uemail;
    private String uaddress;
    private Date ucreatedate;
    private String ustate;
    private String uphone;

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public int getUsex() {
        return usex;
    }

    public void setUsex(int usex) {
        this.usex = usex;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public Date getUcreatedate() {
        return ucreatedate;
    }

    public void setUcreatedate(Date ucreatedate) {
        this.ucreatedate = ucreatedate;
    }

    public String getUstate() {
        return ustate;
    }

    public void setUstate(String ustate) {
        this.ustate = ustate;
    }

    public String getUstyle() {
        return ustyle;
    }

    public void setUstyle(String ustyle) {
        this.ustyle = ustyle;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", urealname='" + urealname + '\'' +
                ", ustyle='" + ustyle + '\'' +
                ", usex=" + usex +
                ", uemail='" + uemail + '\'' +
                ", uaddress='" + uaddress + '\'' +
                ", ucreatedate=" + ucreatedate +
                ", ustate='" + ustate + '\'' +
                ", uphone='" + uphone + '\'' +
                '}';
    }
}
