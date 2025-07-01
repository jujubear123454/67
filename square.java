import java.util.Scanner;
public class square{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("How big would you like your square to be?");
        int size=scan.nextInt();
        for(int i=0; i<size; i++){
            System.out.println("");
            for(int x=0; x<size; x++){
                System.out.print("x");
            }
        }
    }
}