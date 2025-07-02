import java.util.Scanner;
public class connect4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int count=0;
        char turn='X';
        boolean game=true;
        char board[][]= new char[6][7];
        for(int x=0; x<=5; x++){
            for(int i=0; i<=6; i++){
                board[x][i]='_';
            }
         }
        while(game==true){
            for(int y=0; y<=5; y++){
                for(int b=0; b<=6; b++){
                    System.out.print(board[y][b]+" ");
                }
                System.out.println("");
            }
            System.out.println("Player " +turn+ ", enter the column you would like to place your peice in.");
            int col=scan.nextInt();
            if(col>6||col<0){
                System.out.println("That is not a valid column.");
            }
            else{
                for(int a=5; a>=0; a--){
                    if(a==0 && board[0][col] !='_'){
                        System.out.println("This column is full");
                        break;
                    }
                    if(board[a][col]=='_'){
                        board[a][col]=turn;
                        count++;
                        break;
                    }
                }


                //win conditions

                //horizontal
                for(int p=5; p>=0; p--){
                    for(int u=0; u<4; u++){
                        if(board[p][u]==turn && board[p][u+1]==turn && board[p][u+2]==turn && board[p][u+3]==turn){
                            System.out.println("Player " + turn +" has won!");
                            game=false;
                            break;
                        }
                    }
                }
                //vertical
                for(int s=5; s>=3; s--){
                    for(int q=0; q<=6; q++){
                        if(board[s][q]==turn && board[s-1][q]==turn && board[s-2][q]==turn && board[s-3][q]==turn){
                            System.out.println("Player " +turn +" has won!");
                            game=false;
                            break;
                        }
                    }
                }
            }
                        if(turn=='X'){
                            turn='O';
                        }
                        else{
                            turn='X';
                        }
        }
        for(int y=0; y<=5; y++){
                for(int b=0; b<=6; b++){
                    System.out.print(board[y][b]+" ");
                }
                System.out.println("");
            }
    }
}