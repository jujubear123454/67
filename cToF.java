import java.util.Scanner;
public class cToF{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Would you like to convert celcius to farenheit(a) or farenheit to celcius(b)");
        String choice=scan.next();
        if(choice.equals("a")){
            System.out.println("Enter celcius value");
            double c=scan.nextDouble();
            System.out.println("Your farenheit value is "+ convert(c));
        }
        else if(choice.equals("b")){
            System.out.println("Enter farenheit value");
            double f=scan.nextDouble();
            System.out.println("Your celcius value is " +convert2(f));
        }
        else{
            System.out.println("That is not a valid answer. Please restart");
        }
    }
    public static double convert(double c){
        return (c*9/5)+32;
    }
    public static double convert2(double f){
        return (f-32)*5/9;
    }
}