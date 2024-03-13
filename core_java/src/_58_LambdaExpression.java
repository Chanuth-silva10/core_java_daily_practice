
@FunctionalInterface
interface FA1
{
    //	void show();
    void show(int i);
//	void show(int i,int j);


}

public class _58_LambdaExpression {
    public static void main(String[] args) {

        //   	FA1 obj=() -> System.out.println("in Show");  
        //   	obj.show();

//    	FA1 obj=new FA1()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    	obj.show(5);

//    	FA1 obj=(int i) ->System.out.println("in show "+i);
//    	obj.show(5);

//    	FA1 obj=(int i,int j) ->System.out.println("in show "+i);
//    	obj.show(5,8);

        FA1 obj=i -> System.out.println("in show "+i);
        obj.show(5);
    }
}
