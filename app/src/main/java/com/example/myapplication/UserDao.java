package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    //vararg
    @Insert
    void insertUsers(User... users);

    @Query("SELECT name FROM user")
    List<User> getAllNames();
    
    @Query("SELECT * FROM user WHERE name LIKE :name LIMIT 1")
    User findbyName(String name);

}
