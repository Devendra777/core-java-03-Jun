package com.xworkz.userapp.service;

import com.xworkz.userapp.dao.UserDao;
import com.xworkz.userapp.dao.UserDaoImpl;
import com.xworkz.userapp.dto.UserDto;

import java.util.List;

public class UserServiceImpl implements  UserService{

       UserDao dao = new UserDaoImpl();
    @Override
    public UserDto getUserById(int id) {
           if(id > 0)
               return dao.getUserById(id);

           return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return dao.getAllUsers();
    }
}
