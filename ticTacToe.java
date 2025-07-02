import java.util.Scanner;
public class ticTacToe{
    public static void main(String[] args){
        int count=0;
        boolean game=true;
        Scanner scan=new Scanner(System.in);
        char[][] board=new char[3][3];
        char turn='X';
        for(int x=0; x<=2; x++){
            for(int i=0; i<=2; i++){
                board[x][i]='_';
            }
        }
        while(game==true){
            for(int a=0; a<=2; a++){
                for(int w=0; w<=2; w++){
                    System.out.print(board[a][w]+" ");
                }
                System.out.println("");
            }
            System.out.println("It is player's " +turn+ " turn. Enter which row you would like to go in.");
            int row=scan.nextInt();
            System.out.println("Enter which column you would like to go in.");
            int column=scan.nextInt();
            if(row>2||column>2||row<0||column<0){
                System.out.println("That is not a valid place.");
            }
            else if(board[row][column]=='X'||board[row][column]=='O'){
                System.out.println("That place is already taken!");
            }
            else{
                board[row][column]=turn;
                count++;
                
                if(board[0][0]==turn && board[0][1]==turn && board[0][2]==turn){
                    System.out.println("Player "+ turn +" has won!");
                    game=false;
                }
                else if(board[1][0]==turn && board[1][1]==turn && board[1][2]==turn){
                    System.out.println("Player "+ turn +" has won!");
                    game=false;
                }
                else if(board[2][0]==turn && board[2][1]==turn && board[2][2]==turn){
                    System.out.println("Player "+ turn +" has won!");
                    game=false;
                }
                
                

                else if(board[0][0]==turn && board[1][0]==turn && board[2][0]==turn){
                    System.out.println("Player "+ turn +" has won!");
                    game=false;
                }
                else if(board[0][1]==turn && board[1][1]==turn && board[2][1]==turn){
                    System.out.println("Player "+ turn +" has won!");
                    game=false;
                }
                else if(board[0][2]==turn && board[1][2]==turn && board[2][2]==turn){
                    System.out.println("Player "+ turn +" has won!");
                    game=false;
                }
                
                
                else if(board[0][0]==turn && board[1][1]==turn && board[2][2]==turn){
                    System.out.println("Player "+ turn +" has won!");
                    game=false;
                }
                else if(board[0][2]==turn && board[1][1]==turn && board[2][0]==turn){
                    System.out.println("Player "+ turn +" has won!");
                    game=false;
                }

                else if(count==9){
                    System.out.println("You have tied!");
                    game=false;
                }
                if(turn=='X'){
                    turn='O';
                }
                else{
                    turn='X';
                }
            }
            
        }
        for(int a=0; a<=2; a++){
                for(int w=0; w<=2; w++){
                    System.out.print(board[a][w]+" ");
                }
                System.out.println("");
            }
    }
}