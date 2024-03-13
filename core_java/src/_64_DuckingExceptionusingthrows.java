

class NavinException1 extends Exception
{
    public NavinException1(String string)
    {
        super(string);
    }
}

class A9
{
    public void show() throws ClassNotFoundException
    {
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        Class.forName("Calc");
    }
}

public class _64_DuckingExceptionusingthrows {
    static {
        System.out.println("Class Loader");
    }

    public static void main(String[] args) {

//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        A9 obj=new A9();
        try {
            obj.show();
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }
}
