import java.util.*;
class perimeter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int perimeter=2*(l+b);
        System.out.println("Perimeter of rectangle is "+perimeter);
    }
}