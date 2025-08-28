import java.util.*;
class average
{
    public static void main(String args[])
    {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        a= scanner.nextInt();  
        System.out.println("Enter second number");
        b= scanner.nextInt();
        {
            double avg=(a+b)/2;
            System.out.println("Average is:"+avg);
        }
    }
}    