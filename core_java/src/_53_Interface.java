// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A15
{
    //	public abstract void show();
//	public abstract void config();
    int age=44;            // final and static
    String area="Mumbai";

    void show();
    void config();
}

interface X15
{
    void run();
}
interface Y15 extends X15
{

}

class B15 implements A15,Y15
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in cofing");
    }
    public void run()
    {
        System.out.println("running...");
    }
}

public class _53_Interface {
    public static void main(String[] args) {

        A15 obj;
        obj=new B15();

        obj.show();
        obj.config();

        X15 obj1=new B15();
        obj1.run();

        //   	A.area="Hyderabad";

        System.out.println(A15.area);

    }
}

