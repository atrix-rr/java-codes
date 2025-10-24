import java.util.Scanner;
class evenodd
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER A NO.");
        int num=scanner.nextInt();

        if(num%2==0)
        {
            System.out.println("THE ENTERED NO. IS EVEN");
        }
        else
        {
            System.out.println("THE ENTERED NO. IS ODD");
        }
        

    }
}