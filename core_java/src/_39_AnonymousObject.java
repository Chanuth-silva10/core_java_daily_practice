class A1
{
    public A1()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in A1 show");
    }
}


public class _39_AnonymousObject
{
    public static void main(String a[])
    {
        int marks;
        marks=99;

        new A1();   //anonymous object
        new A1().show();

//		A1 obj=new A1();
        A1 obj;
        obj=new A1();

        obj.show();
    }
}


