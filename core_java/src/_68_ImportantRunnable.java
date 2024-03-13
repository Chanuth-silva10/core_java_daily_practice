class Z
{

}

class TAR implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class TBR implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class _68_ImportantRunnable {
    public static void main(String[] args) throws NumberFormatException {

//    	TAR obj1=new TAR();
//    	TBR obj2=new TBR();
//    	Runnable obj1=new TAR();
//    	Runnable obj2=new TBR();


//    	Runnable obj1=new Runnable()
//    	{
//    		public void run()
//    		{
//    			for(int i=1;i<=5;i++)
//    			{
//    				System.out.println("Hello");
//    				try {
//    					Thread.sleep(10);
//    				}catch(InterruptedException e) {
//    					e.printStackTrace();
//    				}
//    			}
//    		}
//   		};

        Runnable obj1=()->
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hi");
                try {Thread.sleep(10);}catch(InterruptedException e) {e.printStackTrace();}
            }
        };

        Runnable obj2=()->
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hello");
                try {Thread.sleep(10);}catch(InterruptedException e) {e.printStackTrace();}
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }

}
