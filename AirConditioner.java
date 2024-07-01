class AirConditioner {
	
	   static boolean isConnected;        
                 // variable      
	   static int     currentTemperature  ; 
	   static  int    minTemperature  ; 
        static int maxTemperature  = 6 ; 
		
		
		
       public static void onOrOff(){
		   	 System.out.println("onOrOff started");
			 // false == false
		    if(isConnected == false){
			 isConnected =true ; 
		  System.out.println("AirConditioner Turned on");
			} else  if(isConnected == true){
				   isConnected = false ;
			 System.out.println("AirConditioner Turned Off");
			}
		
          System.out.println("onOrOff ended");
        return ;		
	   }
	  
	  
	   public static void increaseTemperature(){
				 System.out.println("increaseTemperature() started");
			if(isConnected == true){	       
				 if(currentTemperature <= maxTemperature){
					    currentTemperature= currentTemperature+1 ;
				System.out.println("The current temperature is "+ currentTemperature);		
				}else{
						System.out.println("Max Temperature Reached");
					 } 
			}else{
				System.out.println("Gubee... Ac na On Maadu....");
			}
				 	 System.out.println("increaseTemperature() ended");
				 return ;
				 }
	   
	   /* public static void decreaseTemperature(){
		   // logic
	   }*/
	       
   
        
		 // method Declaration
		public static  void  getFeatures(){
			 System.out.println("getFeatures() started");
		 // local variable
		       String  name= "Samsung";
		  double  price = 7000.00 ; 
		  System.out.println("The Brand Name is "+ name);
		 System.out.println("The Brand Price is "+ price);
		 
			 System.out.println("getFeatures() ended");
		  return ;
		 }
  

}