class Basic
{ 
   public static void main(String[] args)
  {
     int x=12;
     int y=3;
   

     System.out.println("Maximum number of x and y is:"+ Math.max(x,y));
     System.out.println("minimum number of x and y is:"+ Math.min(x,y));
     System.out.println("square root of y is :"+ Math.sqrt(y));
     System.out.println("power of x and y is :"+ Math.pow(x,y));
     System.out.println("Logarthim of x is :"+ Math.log(x));
     System.out.println("Logarthim of y is :"+ Math.log(y));
     System.out.println("Log10 of x is :"+ Math.log10(x));
     System.out.println("Log10 of y is :"+ Math.log10(y));
     System.out.println("exp of a is : " + Math.exp(x));
     System.out.println("cuberoot of x is :"+ Math.cbrt(x));
     System.out.println("String ");


    String s1=new String("Javaprogram") ;
    System.out.println("Length of string :"+ s1.length());
    System.out.println("upper case of string :"+ s1.toUpperCase());
    System.out.println("lower case of string :"+ s1.toLowerCase());
    System.out.println("index of string :"+ s1.indexOf("java"));
   
   
  }
}