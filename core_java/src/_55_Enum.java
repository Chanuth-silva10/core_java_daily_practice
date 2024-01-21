enum Statu{
    Running, Failed, Pending, Success;
}

public class _55_Enum {
    public static void main(String[] args) {

        Statu s=Statu.Pending;

        switch(s)
        {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }

        if(s==Statu.Running)
            System.out.println("All Good");
        else if(s==Statu.Failed)
            System.out.println("Try Again");
        else if ( s==Statu.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

    }
}

