import java.util.Scanner;
import java.util.Random;
public class randomNum{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        boolean game=true;
        int count=0;
        int number= rand.nextInt(100)+1;
        while(game==true){
            System.out.println("Guess a number from 1-100");
            int guess=input.nextInt();
            if(guess>number){
                System.out.println("Lower!");
            }
            if(guess<number){
                System.out.println("Higher!");
            }
            if(guess==number){
                System.out.println("You won!");
                game=false;
            }
            count++;
            if(count==10){
                System.out.println("You have reached the maximum amount of guesses! You lost, the number was " +number+".");
                game=false;
            }
            else{
                System.out.println("You have "+(10-count)+" guesses left.");
            }
        }
    }
}