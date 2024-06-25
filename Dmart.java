class Dmart {

  static  String chocolates[] = {"kit Kat" , "Dairy Milk" , "Snickers" , "Milky bar" , "Eclairs" , "Safari" , "Temptation"};

    static  String   perfumeNames[]  = { "Kamasutra" , "Yardley" };
	
 public static void main(String[] newCollection){
 
     System.out.println("The Available Chocolates are: " + chocolates.length);
	 for (int index = 0 ;   index <= chocolates.length -1 ;   index++  ){
		 System.out.println(chocolates[index]);
	 }
	   // for Each Loop
	   for( String chocolate: chocolates){
		   System.out.println(chocolate) ; 
		   }
	   
	   
	   System.out.println("The Perfumes Available Are:");
	   System.out.println(perfumeNames[0] );
      System.out.println(perfumeNames[1] );

 }









}