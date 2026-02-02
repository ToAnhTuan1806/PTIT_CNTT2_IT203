package com.rikkeiedu.bt;

import java.util.ArrayList;

public class UserManager {
    //dữ liệu dùng chung cho toàn hệ thống
    public static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    // Kiểm tra đăng nhập: đúng username + password -> true, sai -> false
    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
