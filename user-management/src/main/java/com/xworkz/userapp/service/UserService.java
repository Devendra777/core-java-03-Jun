package com.xworkz.userapp.service;

import com.xworkz.userapp.dto.UserDto;

import java.util.List;

public interface UserService {

      UserDto getUserById(int id);

      List<UserDto> getAllUsers();
}
