public class _8_LogicalOperator {
    public static void main(String[] args) {
            int x=7;
            int y=5;
            int a=5;
            int b=9;

		boolean result1= x>y && a<b ;
        System.out.println(result1);
		boolean result2= x>y || a<b ;
        System.out.println(result2);
		boolean result3= x>y && a>b ;
        System.out.println(result3);
		boolean result4= x>y || a>b ;
        System.out.println(result4);
		boolean result5= x<y && a<b ;
        System.out.println(result5);
		boolean result6= x<y || a<b ;
        System.out.println(result6);
		boolean result7= x<y || a<b || a>1 ;

		System.out.println(result7);

            boolean result= a>b ;
            System.out.println(!result);

    }
}
