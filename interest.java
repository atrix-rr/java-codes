import java.util.*;
class interest
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER PRINCIPLE");
        int p=scanner.nextInt();
        System.out.println("ENTER RATE");
        int r=scanner.nextInt();
        System.out.println("ENTER TIME");
        int t=scanner.nextInt();
        int si=(p*r*t)/100;
        System.out.println("SIMPLE INTEREST IS:"+si);
    }
}
                             