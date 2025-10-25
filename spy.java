import java.util.*;
class spy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A 3 DIGIT NUM.");
        int n=sc.nextInt();
        int H=n/100;
        int T=(n/10)%10;
        int O=n%10;

        int SUM=H+T+O;
        int P=H*T*O;
        if(SUM==P){
            System.out.println("SPY NUM");
        }
        else{
            System.out.println("NOT A SPY NUMBER");
        }
        

    }
}