import java.util.Scanner;
public class methods{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your length value?");
        int l=scan.nextInt();
        System.out.println("What is your width value?");
        int w=scan.nextInt();
        System.out.println("Your area is " + area(l, w));
    }
    public static int area(int l, int w){
        return l*w;
    }
}