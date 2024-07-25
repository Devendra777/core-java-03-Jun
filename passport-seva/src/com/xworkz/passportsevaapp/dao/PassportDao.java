package com.xworkz.passportsevaapp.dao;


//   FQCN = package+classname

import com.xworkz.passportsevaapp.dto.PassportDto;

public class PassportDao {
    // dto is non-primitve ref
              PassportDto dto;


      public boolean createPassportUserDetails(PassportDto dto) {
          System.out.println("Creating passport user details");
          boolean isDtoCreated = false;
          if (null != dto) {
            this.dto = dto;
            isDtoCreated = true;
         } else {
            System.out.println("Please provide valid Sur Name");
         }
          System.out.println("user passport process ended");
        return isDtoCreated;
      }
    //


    public void getPassportUserDetails() {
        System.out.println("Fetching user info...");
        System.out.println("The CPR Location is " + dto.cprLocation);

    }
}


