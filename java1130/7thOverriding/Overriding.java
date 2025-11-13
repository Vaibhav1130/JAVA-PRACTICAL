class Vehical
{
    String Vname, Mname;

    void getdata (String V, String M) 
    {
        Vname = V;
        Mname = M;
    }

    void putdata()
    {
        System.out.println("Vehical name=" + Vname);
        System.out.println("Model name=" + Mname);
    }
}

class Car extends Vehical
{
    String Cname;

    void getdata(String V, String M, String C)
    {
        Vname = V;
        Mname = M;
        Cname = C;
    }

    void putdata()
    {
        System.out.println("Car name=" + Cname);
        System.out.println("Vehical name=" + Vname);
        System.out.println("Model name=" + Mname);
    }
}

class Overriding
{
    public static void main (String args[])
    {
        Car c1 = new Car();
        c1.getdata("Verna", "Aulto", "Fortuner");
        c1.putdata();
        
        Vehical c2 = new Vehical();
        c2.getdata("Honda", "Toyota");
        c2.putdata();
    }
}
