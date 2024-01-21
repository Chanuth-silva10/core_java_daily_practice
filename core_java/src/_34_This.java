class Human5
{

    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void SetAge(int age, Human5 obj)
    {
        //Human5 obj1=new Human5();
        Human5 obj1=obj;
        obj1.age=age;
        //this.age=age;
    }

//	public void SetAge(int a)
//	{
//		age=a;
//	}


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

//	public void setName(String n)
//	{
//		name=n;
//	}

}

public class _34_This {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Human5 obj=new Human5();

        obj.SetAge(30,obj);
//		obj.SetAge(30);
        obj.setName("Reddy");

//		System.out.println(obj.abc()+" : "+obj.getAge());
        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}
