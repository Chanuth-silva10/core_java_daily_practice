


//FunctionalInterface
interface FA2
{
    int add(int i, int j);
}

public class _59_LambdaExpressionWithReturnStatement {

    public static void main(String[] args) {
//    	
//   	FA2 obj=new FA2()
//   	{
//   		public int add(int i, int j)
//   		{
//   			return i+j;
//   		}
//   	};

        FA2 obj=(i,j) -> i+j;

        int result=obj.add(5, 4);
        System.out.println(result);
    }
    
}

// Types of Interface:-
//1. Normal interface
//	- an interface having two or more methods
//2. Functional interface (SAM)
//	- SAM => Single Abstract Method interface
//3. Marker interface
//	- an interface that as no methods (blank interface)
