
//class AB
//{
//	public void show()
//	{
//		System.out.println("in AB show");
//	}
//	public void config()
//	{
//		System.out.println("in AB config");
//	}
//}
//class BC extends AB
//{
//	public void show()
//	{
//		System.out.println("in BC show");
//	}
//}

class Calc8
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class AdvCalc8 extends Calc8
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}


public class _42_MethodOverriding{
    public static void main(String args[])
    {
//		BC obj=new BC();
//		obj.show();
//		obj.config();

        AdvCalc8 obj=new AdvCalc8();
        int r1=obj.add(3, 4);
        System.out.println(r1);
    }
}
