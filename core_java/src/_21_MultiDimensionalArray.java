public class _21_MultiDimensionalArray {
    public static void main(String[] args) {
        int nums[][]=new int [3][4];
        //inr random=0;
        //int random=(int)Math.random()*100;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                nums[i][j]=(int)Math.random()*100;
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println(nums[i][j]+" ");
            }
            System.out.println();
        }

        for(int n[]:nums)
        {
            for(int m:n)
            {
                System.out.println(m+" ");
            }
            System.out.println();
        }
    }
}


// int i=5;
//int j=6;
//int k=7;
//int num[]= {5,6,7};
//int num[]=new int[4];
