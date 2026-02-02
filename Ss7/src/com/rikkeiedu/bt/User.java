package com.rikkeiedu.bt;

public class User {
    public final int id;       // ID không thể sửa
    public String username;    // Tên đăng nhập
    public String password;    // Mật khẩu

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "User[id=" + id + ", name=" + username + "]";
    }
}
