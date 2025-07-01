import java.util.Scanner;
public class shoppingList{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("How long do you want your shopping list to be?");
        int length=scan.nextInt();
        String[] list=new String[length];
        for(int x=0; x<length; x++){
            System.out.println("What would you like to add to your list?");
            String item=scan.next();
            list[x]=item;
        }
        System.out.println("Here is your list:");
        for(int i=0; i<length; i++){
            System.out.println(list[i]);
        }
    }
}