import java.util.Scanner;
public class echo{
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name=input.nextLine();
        System.out.println("Hello, " +name+"!");
        System.out.println("How old are you?");
        String ageStr=input.nextLine();
        int age=Integer.parseInt(ageStr);
        System.out.println("Wow! Your "+age+" years old!");
    }
}
    