class A11
{
    public void show()
    {
        System.out.println("in A show");
    }
}
//class B11 extends A11
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}

public class  _50_AnnonumousInnerClass{
    public static void main(String[] args) {

        //A obj=new B();

        A11 obj=new A11()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}

