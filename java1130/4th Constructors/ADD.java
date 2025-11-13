class ADD
{
    int x,y;
    ADD()
    {
        System.out.println("Inside Default Constructor");
    }
    ADD (int a,int b)
    {
        x=a;
        y=b;
        System.out.println("Inside Parameterised Constructor");
    }
    void addition()
    {
        System.out.println("Addition="+(x+y));
    }
    public static void main (String args[])
    {
        ADD a1=new ADD();
        ADD a2=new ADD(20,30);

        a1.addition();
        a2.addition();
    }
}