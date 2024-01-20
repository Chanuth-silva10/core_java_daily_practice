public class _6_AssignmentOperator {
    public static void main(String[] args) {
	int num1=7;
    int num2=5;
    int resultAddition=num1+num2;
    System.out.println(resultAddition);


    int num3=7;
    int num4=5;
    int resultSubtract=num3-num4;
    System.out.println(resultSubtract);


    int num5=7;
    int num6=5;
    int resultMultiplication=num5*num6;
    System.out.println(resultMultiplication);


    int num7=7;
    int num8=5;
    int resultDivision=num7/num8;
    System.out.println(resultDivision);


    int num11=7;
    int num21=5;
    int resultModules=num11%num21;
    System.out.println(resultModules);

        int num=7;
		num=num+2;
		num+=2;
		num*=2;

        num++;    //post increment
        ++num;    //pre increment
        num--;    //post decrement
        --num;	  //pre decrement
        System.out.println(num);

        int result=num++; //fetch the value and then increment
        System.out.println(result);

    }

}
