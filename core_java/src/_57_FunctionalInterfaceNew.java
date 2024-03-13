
@FunctionalInterface
interface FA
{
    void show();
//	void run(); // Give error because only one method
}
class FB implements FA
{
	public void show()
	{
		System.out.println("in Show");
	}
}

public class _57_FunctionalInterfaceNew {

    public static void main(String[] args) {

        FA obj=new FA()
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };
        //   	FA obj=new FA(); // Can not write this and you must implement method
           	FA obj1=new FB();
        obj.show();
    }


}
