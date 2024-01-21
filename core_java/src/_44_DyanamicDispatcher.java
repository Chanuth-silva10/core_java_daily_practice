// class Computer
// {
//
// }
// class Laptop extends Computer
// {
//
// }

class A12
{
    public void show()
    {
        System.out.println("in A12 show");
    }
}

class B12 extends A12
{
    public void show()
    {
        System.out.println("in B12 show");
    }
}

class C12 extends A12
{
    public void show()
    {
        System.out.println("in C12 show");
    }
}

class D12
{

}


public class _44_DyanamicDispatcher{
    public static void main(String[] args) {
//		A12 obj=new B12();
//		obj.show();

        A12 obj=new A12();
        obj.show();

        obj=new B12();
        obj.show();

        obj=new C12();
        obj.show();

//		obj=new D12();

//		Laptop obj1=new Laptop();
//		Computer obj1=new Laptop();

    }
}
