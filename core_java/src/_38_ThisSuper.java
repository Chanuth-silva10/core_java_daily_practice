class C extends Object
{
    int num= 1;
}

class D extends C
{
    int num=2;
    public int getValue()
    {
        int num=3;
//		return this.num;
        return super.num;
    }
}


public class _38_ThisSuper
{
    public static void main(String a[])
    {
        D obj=new D();
//		System.out.println(obj.num);
        System.out.println(obj.getValue());
    }
}