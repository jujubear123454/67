import java.util.Scanner;
public class whileLoops{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String answer="yes";
        while(answer.equals("yes")){
            System.out.println("Hello");
            System.out.println("Would you like to say hello again? yes or no");
            answer=input.nextLine();
        }
    }
}