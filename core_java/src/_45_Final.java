//final - variable, method, class

//final class Cac21
//{
//	public void show()
//	{
//		System.out.println("in Cac21 show");
//	}
//	public void add(int a, int b)
//	{
//		System.out.println(a+b);
//	}
//}


class Cac21
{
    public final void show()
    {
        System.out.println("By Navin");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

class AdvCalc21 extends Cac21
{
    public void show1()
    {
        System.out.println("By John");

    }


    public class  _45_Final{
        public static void main(String[] args) {

//    	final int num=8;
//    	num=9;
//    	System.out.println(num);

//    	Cac21 obj= new Cac21();
//    	obj.show1();
//    	obj.add(4, 5);

            AdvCalc21 obj= new AdvCalc21();
            obj.show1();
            obj.add(4, 5);
        }
    }
}