package com.xworkz.userapp.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@Getter
@ToString
public class UserDto {


       private int id;
       private String firstName;

}
