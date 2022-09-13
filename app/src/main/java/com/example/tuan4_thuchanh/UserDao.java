package com.example.tuan4_thuchanh;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> users = new ArrayList<User>();
    public List<User> getUsers() {
        return users;
    }
    public User us = new User("abc","abc","abc","abc","abc","abc","abc");
    public UserDao() {
    }
    public void addUser(User us){
        users.add(us);
    }
    public boolean getUserByUserName(String s){
        for (User us:users){
            if (s.equals(us.getUsername())){
                return true;
            }
        }
        return false;
    }
}
