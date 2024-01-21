/*

abstract class Computer
{
//	public void code()
//	{
//
//	}
	public abstract void code();
}

class Laptop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class _51_Interface {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();

        Computer lap=new Laptop();
        Computer desk=new Desktop();

        Developer navin=new Developer();
        navin.devApp(lap);

    }
}
*/



interface Computer1
{
    void code();
}

class Laptop1 implements Computer1
{
    public void code()
    {
        System.out.println("code, compile, run");
    }

}

class Desktop1 implements Computer1
{
    public void code()
    {
        System.out.println("code, compile, faster");
    }
}
class Developer1
{
    //	public void devApp(Laptop lap)
    public void devApp(Computer1 lap)
    {
        lap.code();
    }
}

public class _51_Interface {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();

        Computer1 lap=new Laptop1();
        Computer1 desk=new Desktop1();

        Developer1 navin=new Developer1();
        navin.devApp(lap);

    }
}
