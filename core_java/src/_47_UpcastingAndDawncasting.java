class A5
{
    public void show1()
    {
        System.out.println("in A5  show");
    }
}
class B5  extends A5
{
    public void show2()
    {
        System.out.println("in show B5 ");
    }
}

public class  _47_UpcastingAndDawncasting{
    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d;
//
//    	System.out.println(i);

//    	A5  obj= new A5 ();
//    	A5  obj=(A5 ) new B5 ();   //upcasting
//    	obj.show1();

        A5  obj=new B5 ();
        obj.show1();

        B5  obj1=(B5 )obj;
        obj1.show2();
    }
}

