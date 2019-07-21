package com.fcx.entity;

/**
 * @Author: fancaixing
 * @Date: 2019/7/21 11:20
 * @Version 1.0
 */
public class User {
    private int id;
    private String t_name;
    private String address;
    private int age;
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return t_name;
    }

    public void setName(String name) {
        this.t_name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", t_name='" + t_name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
