import java.util.Scanner;
import java.util.Random;
public class rockPaperScissors{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        boolean game=true;
        while(game==true){
            System.out.println("Please choose rock(0), paper(1), or scissors(2).");
            int choice=input.nextInt();
            int comp=rand.nextInt(3);
            if(choice==0){
                if(comp==2){
                    System.out.println("You won! Rock breaks scissors.");
                }
                else if(comp==1){
                    System.out.println("You lost! Paper covers rock.");
                }
                else{
                    System.out.println("You tied! Both chose rock.");
                }
            }
            else if(choice==1){
                if(comp==2){
                    System.out.println("You lost! Scissors cuts paper.");
                }
                else if(comp==1){
                    System.out.println("You tied! Both chose paper.");
                }
                else{
                    System.out.println("You won! Paper covers rock.");
                }
            }
            else{
                if(comp==2){
                    System.out.println("You tied! Both chose scissors");
                }
                else if(comp==1){
                    System.out.println("You won! Scissors cuts paper.");
                }
                else{
                    System.out.println("You lost! Rock breaks scissors.");
                }
            }
            System.out.println("Would you like to play again? Yes or no");
            String play=input.next();
            if(play.equals("yes")){
                game=true;
            }
            else{
                game=false;
            }
        }
    }
}