class Garbage
{

  public void finalize()

  { 
    System.out.println("cleaning an object ");
  }

    public static void main (String args[])
    {
      Garbage g1 = new Garbage(); 
      Garbage g2 = new Garbage();
      Garbage g3 = new Garbage();


      g1=null;
      g2=null;
      g3=null;
      

      System.gc(); 
    }
}