public class _11_TernaryOperator {
    public static void main(String[] args) {
		int n=4;
		int result=0;
		if(n%2==0)
			result=10;

		else
			result =20;
		System.out.println(result);

        int n1=5;
        int result1=0;
        result1 = n1%2==0 ? 10 : 20;
        System.out.println(result1);
    }
}
