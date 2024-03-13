
// - New State
// - Runnable State  ->  start() method
// - Running State     -> a thead is running with run() method
// - Waiting State	    -> sleep(),  wait() method
// - Dead State
//
// Through notify(), you will go to waiting state to runnable state.
// From Running, Runnable state to dead state through stop() method.

class TA extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hi");
        }
    }
}

class TB extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("Hello");
        }
    }
}

public class _66_MultipleThreads {

    public static void main(String[] args) throws NumberFormatException {

        TA obj1=new TA();
        TB obj2=new TB();

//    	obj1.show();
//    	obj2.show();

        obj1.start();
        obj2.start();
    }

}
