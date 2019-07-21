package com.fcx.entity;

import java.io.Serializable;

/**
 * @Author: fancaixing
 * @Date: 2019/7/21 13:57
 * @Version 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = 8655851615465363473L;

    private int id;
    private String name;
    private String pwd;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public User() {
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
