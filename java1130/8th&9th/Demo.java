class Access
{    
    public int a = 5;    
    private int b = 10;    
    protected int c = 15;    
    int d = 20;             


    public int getB()
    {
        return b;
    }

    void display()
    {       
        System.out.println("a = " + this.a);       
        System.out.println("b = " + this.b);       
        System.out.println("c = " + this.c);       
        System.out.println("d = " + this.d);    
    }  
}  

class Demo extends Access
{    
    void output()
    {        
        System.out.println("a = " + this.a);       
        // System.out.println("b = " + this.b);       
        System.out.println("b = " + getB());       
        System.out.println("c = " + this.c);        
        System.out.println("d = " + this.d);    
    }    
    
    public static void main(String[] args)
    {        
        Demo d = new Demo();        
        d.display();        
        d.output();    
    }  
}
