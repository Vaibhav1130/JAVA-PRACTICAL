class SUB
{
    int x,y,z;
    SUB()
    {
        System.out.println("Inside Default Constructor");
    }
    SUB (int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
        System.out.println("Inside Parameterised Constructor");
    }
    void subtraction()
    {
        System.out.println("Subtraction="+(x-y-z));
    }
    public static void main (String args[])
    {
        SUB a1=new SUB();
        SUB a2=new SUB(50,100,20);

        a1.subtraction();
        a2.subtraction();
    }
}