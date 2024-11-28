package com.xworkz.userapp.dao;

import com.xworkz.userapp.dto.UserDto;

import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements  UserDao{
    @Override
    public UserDto getUserById(int id) {

         return new UserDto(id,"Dev Singh");
    }

    @Override
    public List<UserDto> getAllUsers() {
         List<UserDto> userDtos = new ArrayList<>();
         userDtos.add(new UserDto(1 , "Baba"));
        userDtos.add(new UserDto(2, "Dev Singh"));
        userDtos.add(new UserDto(3, "Lalu"));
        userDtos.add(new UserDto(4, "Prasad"));
        return userDtos;
    }
}
