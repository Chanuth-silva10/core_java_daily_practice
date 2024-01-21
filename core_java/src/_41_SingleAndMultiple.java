class CalcA
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}


class AdvCalc extends CalcA
{
    public int multi(int n1, int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}

//class VeryAdvCalc extends CalcA
class VeryAdvCalc extends AdvCalc
{
    public double power(int n1,int n2)
    {
        return Math.pow(n1, n2);
    }
}

public class _41_SingleAndMultiple
{
    public static void main(String a[])
    {
//		CalcA obj=new CalcA();
//		AdvCalc obj=new AdvCalc();
        VeryAdvCalc obj=new VeryAdvCalc();

        int r1=obj.add(4, 5);
        int r2=obj.sub(7,3);
        int r3=obj.multi(5,3);
        int r4=obj.div(15,4);
        double r5=obj.power(4,2);

        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);

    }
}


// class A{
//
// }
// class B extends A{
//
// }
// class C extends A,B
// Multiple inheritance does not supported by Java
// mbiguity issue
// class C extends B{
//
// }
//
//  public class Demo{
//	public static void main(String args[])
//	{
//
//	}
//  }

