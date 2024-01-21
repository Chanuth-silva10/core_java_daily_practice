public class _9_If_Else {

    public static void main(String[] args) {
		int x=8;
		System.out.println("Hello");
		System.out.println("Bye");

		int y=18;
		if(y>10) {
			System.out.println("Hello");
		}

		if(true) {
			System.out.println("Hello");
		}

		int z=28;
		if(z>10 && z<=20) {       //11-20
			System.out.println("Hello");
		}
		System.out.println("Bye");

		int p=28;
		if(p>10 && p<=20) {       //11-20
			System.out.println("Hello");
		}
		else
		System.out.println("Bye");

        int q=8;
        int w=7;
        if(q>w) {
            System.out.println(x);
            System.out.println("Thankyou");
        }
        else
            System.out.println(y);
    }
}
