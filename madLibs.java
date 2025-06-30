import java.util.Scanner;
public class madLibs{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Give me an adjective.");
        String adjective=input.nextLine();
        System.out.println("Give me a noun.");
        String noun=input.nextLine();
        System.out.println("There was a "+ adjective +" ball that landed in the "+noun+".");
    }
}