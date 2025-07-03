import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class hangMan{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        String word="bat";
        boolean alreadyUsed=false;
        int countSpaces=word.length();
        List<String> usedLetters=new ArrayList<>();
        String[] length=new String[word.length()];
        boolean game=true;
        int count=0;
        for(int x=0; x<word.length(); x++){
            length[x]="_";
        }
        while(game==true){
            for(int t=0; t<word.length(); t++){
                System.out.print(length[t]+" ");
            }
            System.out.println("");
            System.out.println("Enter a letter.");
            String letter=scan.next();
            if(usedLetters.contains(letter)){
                System.out.println("You have already used that letter.");
                alreadyUsed = true;
            }
            count++;
            int index=word.indexOf(letter);
            if(index==-1){
                System.out.println("That letter is not in the word.");
                if(alreadyUsed==false){
                    usedLetters.add(letter);
                }
            }
            else if(alreadyUsed==false){
                System.out.println("That letter is in the word.");
                length[index]=letter;
                usedLetters.add(letter);
                countSpaces--;
            }
            System.out.println("You have used the letters:");
            for(int p=0; p<usedLetters.size(); p++){
                System.out.println(usedLetters.get(p));
            }
            for(int b=0; b<word.length(); b++){
                if(length[b]!="_"&&countSpaces==0){
                    System.out.println("You won!");
                    game=false;
                }
            }

        }
    }
}