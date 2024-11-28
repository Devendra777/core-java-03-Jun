package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.UserDto;

import java.util.List;

public interface UserDao {


     UserDto   getUserById(int id);

     List<UserDto> getAllUsers();
}
