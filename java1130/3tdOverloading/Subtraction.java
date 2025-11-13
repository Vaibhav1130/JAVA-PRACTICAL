class Sub
{
  int a,b,c,d;
  
 void sub(int p, int q)
  { 
    a=p; b=q;
    System.out.println("Subtraction="+(p-q));
  }

 void sub(int p, int q, int r)
  {
    a=p; b=q; c=r;
    System.out.println("Subtraction="+(p-q-r));
  }
}

class Subtraction
 {
    public static void main (String arge[])
    {
      Sub a1=new Sub();
      a1.sub(7,6);
      a1.sub(9,5,1);
    }
 }
