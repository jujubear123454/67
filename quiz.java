import java.util.Scanner;
public class quiz{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int points=0;
        System.out.println("How many continents are there in the world?");
        String continents=input.nextLine();
        if(continents.equals("seven") || continents.equals("7")){
            System.out.println("That is correct!");
            points++;
        }
        else{
            System.out.println("That is wrong. The correct answer is 7.");
        }
        System.out.println("How many legs does a spider have?");
        String legs=input.nextLine();
        if(legs.equals("eight")){
            System.out.println("That is correct!");
            points++;
        }
        else if(legs.equals("8")){
            System.out.println("That is correct!");
            points++;
        }
        else{
            System.out.println("That is wrong. The correct answer is 8.");
        }
        if(points==1){
            System.out.println("You got 1 point out of 2.");
        }
        else{
            System.out.println("You got "+points+" points out of 2.");
        }
    }
}