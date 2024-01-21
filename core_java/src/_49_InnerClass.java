class A6
{
    int age;

    public void show()
    {
        System.out.println("in show");
    }

//	class B6
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}

    static class B6
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}


public class  _49_InnerClass{
    public static void main(String[] args) {
        A6 obj=new A6();
        obj.show();

//    	A6.B6 obj1=obj.new B6();
//    	obj1.config();

        A6.B6 obj1=new A6.B6();
        obj1.config();

    }
}

