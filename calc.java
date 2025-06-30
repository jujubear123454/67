import java.util.Scanner;
public class calc{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        boolean choice=true;
        while(choice==true){
            System.out.println("What is your first number?");
            double num1=input.nextDouble();
            System.out.println("What is your second number?");
            double num2=input.nextDouble();
            System.out.println("What operation would you like to do? Choose one of the following: x, /, +, -");
            String equation=input.next();
            if(equation.equals("x")){
                System.out.println("Your answer is "+(num1*num2));
            }
            else if(equation.equals("/")){
                System.out.println("Your answer is " +(num1/num2));
            }
            else if(equation.equals("+")){
                System.out.println("Your answer is "+(num1+num2));
            }
            else if(equation.equals("-")){
                System.out.println("Your answer is "+(num1-num2));
            }
            else{
                System.out.println("That is not a valid operation.");
            }
            System.out.println("Would you like to do another operation? Yes or no");
            String choice2=input.next();
            if(!choice2.equals("yes")){
                choice=false;
            }
     }
    }
}