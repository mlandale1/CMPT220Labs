package lab04;

import java.util.Scanner;

public class TicTacToe {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[][] board = {{0,0,0,},{0,0,0,},{0,0,0}};

        int player = 1;

        while(!(checkForWinner(board))){
            printBoard(board);

            int[] coordinates = getPlayerMove();
            int row = coordinates[0];
            int col = coordinates[1];

            markBoard(board, row, col, player);

            player = (player % 2) + 1;
        }

        printBoard(board);
        if (player ==1) System.out.println("O's have won the game!");
        else System.out.println("X's have won the game!");
    }
    public static boolean hasBlanks(int[][] board){
        boolean flag = false;
        for(int[] row: board){
            for(int num: row){
                if (num == 0) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
    private static boolean checkForWinner(int[][] board){
        boolean ans = false;
        for(int i = 0; i<3; i++){
            if ((board[0][i] == board[1][i]) && (board[0][i] == board[2][i]) && (board[0][i] !=0)){
                ans = true;
                break;
            }
        }
        for (int i = 0; i < 3; i++){
            if ((board[0][i] == board[1][i]) && (board[0][i] == board[2][i]) && (board[0][i] !=0)){
                ans = true;
                break;
            }
        }
        if ((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && (board[0][0] !=0)){
            ans = true;
        }
        if ((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && (board[0][2] != 0)){
            ans = true;
        }
        return ans;

    }
    private static void printBoard(int[][] board){
        StringBuilder boardString = new StringBuilder();
        char fill;

        for(int i=0;i<3;i++){
            boardString.append("+---+---+---+\n");

            for (int j=0;j<3;j++){
                if (board[i][j] == 1) fill = 'X';
                else if (board[i][j] == 2) fill = 'O';
                else fill = ' ';
                boardString.append("| ").append(fill).append(" ");
            }
            boardString.append("|\n");
        }
        boardString.append("+---+---+---+");

        System.out.println(boardString);
    }

    private static int[] getPlayerMove(){
        int row;
        int col;

        do {
            System.out.println("Enter the row of choice: ");
            row = scanner.nextInt();

            if(!((1<=row) && (row<=3))) System.out.println("Error Invalid Row - Try Again!");
        } while (!((1<=row) && (row<=3)));
        //get column
        do {
            System.out.print("Enter the column: ");
            col = scanner.nextInt();

            if(!((1<=col) && (col<=3))) System.out.println("Error Invalid Column - Try Again!");
        } while (!((1<=col) && (col<=3)));
        return new int[] {row-1, col-1};
    }
    private static void markBoard(int[][] board, int row, int col, int player){
        if (board[row][col] == 0){
            board[row][col] = player;
        }
        else{
            while(!(board[row][col] == 0)){
                printBoard(board);
                System.out.println("Spot is taken. Try Another Spot.");
                int[] coordinates = getPlayerMove();
                row = coordinates[0];
                col = coordinates[1];
            }
        }
        board[row][col] = player;
    }

}
