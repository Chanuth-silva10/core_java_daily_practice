public class _10_If_Else_If {
    public static void main(String[] args) {
		int x1=8;
		int y1=7;
		int z1=8;

		if(x1>y1 && x1>z1)  //false
		{
			System.out.println(x1);
		}
		else
			System.out.println(y1);

		int x=8;
		int y=7;
		int z=9;
		if(x>y && x>z)         //false
			System.out.println(x);
		else if(y>x && y>z)
			System.out.println(y);
		else
			System.out.println(z);


        int x2=8;
        int y2=7;
        int z2=9;
        if(x2>y2 && x2>z2)         //false
            System.out.println(x2);
        else if(y2>z2)
            System.out.println(y2);
        else
            System.out.println(z2);


    }
}
