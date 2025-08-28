import java.util.*;
class guessgame
 {
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        int number = 99; // secret number
        int guess = 0;

        System.out.println("Guess a number between 1 and 100: ");
        while(guess != number)
         {
            guess = sc.nextInt();
            if(guess < number)
            {
                System.out.println("WRONG NUMBER, try again!");
            } else if(guess > number)
             {
                System.out.println("WRONG , try again!");
            } else 
            {
                System.out.println("WOHOOO!! Correct! You guessed it!");
            }
        }
        sc.close();
    }
}
