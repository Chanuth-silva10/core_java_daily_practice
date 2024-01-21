class Human6
{
    private int age;
    private String name;

    public Human6()
    {
        age=12;
        name="John";
    }
    public Human6(String name) {
        this.age=age;
        this.name=name;
    }
    public Human6(int age, String name)
    {
        this.age=age;
        this.name=name;
    }


//	public Human6()    //default constructor
//	{
//		age=12;
//		name="John";
//		//System.out.println("in constructor");
//	}
//	public Human6(int a, String n)  //Parameterized constructor
//	{
//		age=a;
//		name=n;
//	}

    public int getAge(){
        return age;
    }
    public void SetAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}

public class _36_DefaultAndParameter {
    public static void main(String[] args) throws ClassNotFoundException
    {
        Human6 obj=new Human6();
//		Human6 obj1=new Human6(18, "Navin");
        System.out.println(obj.getName()+" : "+obj.getAge());
//		System.out.println(obj1.getName()+" : "+obj1.getAge());

//		obj.SetAge(30);
//		obj.setName("Reddy");


        //System.out.println(obj.getName()+" : "+obj.getAge());
    }
}



