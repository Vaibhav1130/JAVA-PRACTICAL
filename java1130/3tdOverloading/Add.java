class Addition
{
  int a,b,c,d;
  
 void add(int p, int q)
  { 
    a=p; b=q;
    System.out.println("Addition="+(p+q));
  }

 void add(int p, int q, int r)
  {
    a=p; b=q; c=r;
    System.out.println("Addition="+(p+q+r));
  }
}

class Add
 {
    public static void main (String arge[])
    {
      Addition a1=new Addition();
      a1.add(5,5);
      a1.add(3,2,3);
    }
 }
