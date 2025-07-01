import java.util.Scanner;
public class rightTriangle{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("How tall do you want your right triangle to be?");
        int h=scan.nextInt();
        for(int i=0; i<h; i++){
            System.out.println("");
            for(int x=0; x<(i+1); x++){
                System.out.print("x");
            }
        }
    }
}