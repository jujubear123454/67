import java.util.Scanner;
public class connect4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int count=0;
        boolean fullcol=false;
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
                fullcol=true;
            }
            else{
                for(int a=5; a>=0; a--){
                    if(a==0 && board[0][col] !='_'){
                        System.out.println("This column is full");
                        fullcol=true;
                        break;
                    }
                        if(board[a][col]=='_'){
                            board[a][col]=turn;
                            fullcol=false;
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
                //diagonal
                for(int v=0; v<=2; v++){
                    for(int e=0; e<=3; e++){
                        if(board[v][e]==turn && board[v+1][e+1]==turn && board[v+2][e+2]==turn && board[v+3][e+3]==turn){
                            System.out.println("Player "+turn+" has won!");
                            game=false;
                            break;
                        }
                    }
                }
                for(int i=5; i>=3; i--){
                    for(int c=0; c<=3; c++){
                        if(board[i][c]==turn && board[i-1][c+1]==turn && board[i-2][c+2]==turn && board[i-3][c+3]==turn){
                            System.out.println("Player "+turn+" has won!");
                            game=false;
                            break;
                        }
                    }
                }
                if(game==false){
                    break;
                }
                //tie
                if(count==42){
                    System.out.println("You have drawed!");
                    game=false;
                    break;
                }
            }
                    if(fullcol==false){
                        if(turn=='X'){
                            turn='O';
                        }
                        else{
                            turn='X';
                        }
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