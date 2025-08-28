import java.util.*;
class calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER:");
        int a=sc.nextInt();

        System.out.println("ENTER SECOND NUMBER");
        int b=sc.nextInt();

        System.out.println("CHOOSE OPERATOR(+ - * /):");
        char op=sc.next().charAt(0);

        int result=0;
        if(op == '+') result = a + b;
        else if(op == '-') result = a - b;
        else if(op == '*') result = a * b;
        else if(op == '/') result = a / b;
        
        System.out.println("RESULT IS:"+result);
    }
}