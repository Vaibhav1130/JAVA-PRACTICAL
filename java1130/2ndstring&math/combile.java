class Basic { 
  public static void main(String args[])
  {
      int x = 25;
      int y = 5;

      // Math methods
      System.out.println("Maximum number of x and y is: " + Math.max(x, y));
      System.out.println("Minimum number of x and y is: " + Math.min(x, y));
      System.out.println("Square root of y is: " + Math.sqrt(y));
      System.out.println("Power of x to y is: " + Math.pow(x, y));
      System.out.println("Logarithm of x is: " + Math.log(x));
      System.out.println("Logarithm of y is: " + Math.log(y));
      System.out.println("Log10 of x is: " + Math.log10(x));
      System.out.println("Log10 of y is: " + Math.log10(y));
      System.out.println("Exponential of x is: " + Math.exp(x));
      System.out.println("Cube root of x is: " + Math.cbrt(x));

      // String methods
      String s1 = new String("Vaibhav");
      System.out.println("Length of string: " + s1.length());
      System.out.println("Upper case of string: " + s1.toUpperCase());
      System.out.println("Lower case of string: " + s1.toLowerCase());
      System.out.println("Index of 'gram' in string: " + s1.indexOf("gram")); 
      System.out.println("Substring from index 1: " + s1.substring(1));
      System.out.println("String after replacing 'v' with 'y': " + s1.replace('v', 'y')); 
  }
}
