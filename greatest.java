import java.util.*;
class greatest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner("System.in");
        System.out.println("ENTER FIRST NUMBER");
        int a=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");      
        int b=sc.nextInt();
        System.out.println("ENTER THIRD NUMBER");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("GREATEST NUMBER IS:"+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("GREATEST NUMBER IS:"+b);
        }
        else
        {
            System.out.println("GREATEST NUMBER IS:"+c);
        }

    }
}