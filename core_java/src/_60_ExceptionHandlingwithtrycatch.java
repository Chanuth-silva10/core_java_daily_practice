public class _60_ExceptionHandlingwithtrycatch {
    public static void main(String[] args) {

        int i=0;
        int j=0;

        try
        {
            j=18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        System.out.println(j);

        System.out.println("Bye");
    }
}


// Types of error:-
//1. Complile - time error
//2. Runtime error -> Exception handling
//3. Logical error




//public class Demo {
//    public static void main(String[] args) {
//
////  	System.out.Println();
//    	System.out.println(2+2);
//
//    }
//}