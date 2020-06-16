package com.example.demoredis.entity;

import lombok.Data;

@Data
public class UserInfo {
    private Integer id;
    private String userName;
    private String userSex;

    public UserInfo() {
        this(0, "", "");
    }

    public UserInfo(Integer id, String name, String sex) {
        this.id = id;
        this.userName = name;
        this.userSex = sex;
    }

    @Override
    public String toString() {
        return this.id + "--" + this.userName + "--" + this.userSex;
    }
}
