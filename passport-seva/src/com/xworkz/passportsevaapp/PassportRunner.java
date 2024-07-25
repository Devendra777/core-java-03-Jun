package com.xworkz.passportsevaapp;

import com.xworkz.passportsevaapp.dao.PassportDao;
import com.xworkz.passportsevaapp.dto.PassportDto;

public class PassportRunner {

    public static void main(String[] args) {
        System.out.println("main started");


        PassportDto dto = new PassportDto();
         dto.cprLocation = "PO";
         dto.dcdrLocation = 8;
         dto.surName = "";
         dto.givenName = "";
         dto.dob = "";
         dto.email ="";
         dto.isEmailLoginSame = true;
         dto.password = "";
         dto.confirmPassword = "";
         dto.hintQues = "";
         dto.hintAns = "";
         dto.captcha = "";

        PassportDao passportDao = new PassportDao();
       // has a relationship
        passportDao.createPassportUserDetails(dto);

        passportDao.getPassportUserDetails();

        System.out.println("main ennded");
    }
}
