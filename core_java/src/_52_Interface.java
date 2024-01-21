interface A14
{
    //	public abstract void show();
//	public abstract void config();
    int age=44;            // final and static
    String area="Mumbai";

    void show();
    void config();
}

class B14 implements A14
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in cofing");
    }
}

public class _52_Interface {
    public static void main(String[] args) {

        A14 obj;
        obj=new B14();

        obj.show();
        obj.config();

        //   	A.area="Hyderabad";

        System.out.println(A14.area);

    }
}

