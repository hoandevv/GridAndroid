package com.example.gridview1003;

public class Football {

    String fullName;
    String address;
    int avatar;
    int flag;

    public Football(String fullName, String address, int avatar, int flag) {
        this.fullName = fullName;
        this.address = address;
        this.avatar = avatar;
        this.flag = flag;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public int getAvatar() {
        return avatar;
    }

    public int getFlag() {
        return flag;
    }
}