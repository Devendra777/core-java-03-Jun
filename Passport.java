class Passport {
	
	 static String cprLoc ;
	  static  int  dcdrLoc ; 
	 static String surNm ; 
	 static  String givenNm;
	 static String dateOfBirth ;
	 static String emailId;
	 static  boolean isEmailLoginSm ;
	static  String lId ;
	 static String pwd ;
	 static String cPwd;
	static String hintQ ; 
	static String hintA ; 
    static String captchaValue ; 


  
    // Method 
     public static boolean createPassport(String cprLocation ,int 
	 dcdrLocation , String surName,
	 String givenName ,String dob , String email, 
	 boolean isEmailLoginSame , String loginId , String password ,String confirmPassword,
 String hintQues , String hintAns, String captcha){
			  boolean isPassportDataCreated = false ;
				                   
								   
					 cprLoc		   =  cprLocation ; 
					 dcdrLoc       =  dcdrLocation ; 
					 surNm         =  surName ; 
					 givenNm       =   givenName;
				dateOfBirth	       =   dob;
				      emailId      =   email;
			 isEmailLoginSm        =   isEmailLoginSame;
			             lId       =   loginId;
						pwd		   =   password ;
						cPwd	   =   confirmPassword;
						hintQ	   =    hintQues;
				        hintA	   =    hintAns;
					captchaValue   =   captcha;
 



 
		 // isEmailLoginSame,loginId,pwd,confirmPwd,hintQues,hintAns,captcha);
 return isPassportDataCreated;
			}
			
			  public static void getPassportDetails(){
				  System.out.println("Fetching your passport details-----");
				    System.out.println("The cpr Location is:" +cprLoc);
			        System.out.println("The dcdr Location is:" +dcdrLoc);
			        System.out.println("The Sur Name Is :" +surNm);
			        System.out.println("The given Name is:" +givenNm);
			        System.out.println("The date of birth is:" +dateOfBirth);
			        System.out.println("The email is:" +emailId);
			        System.out.println("Is Email Login Id Same:"+ isEmailLoginSm);
			        System.out.println("Login Id :"+ lId);
			        System.out.println("Password :"+ pwd);
		            System.out.println("Conform Password :"+ cPwd);
		            System.out.println("Hidden Question : "+ hintQ);
		            System.out.println("Hidden Answer :"+ hintA);
		            System.out.println("Captcha: "+ captchaValue);
					System.out.println("End of Details=--------");
			  }





}