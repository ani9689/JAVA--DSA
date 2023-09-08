public class N_Queen {
    public static void main(String[] args) {
        int n= 2;
        char borad[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++) {
                borad[i][j]='.';
            }
        }
        nQueens(borad,0);
    }
    public static void nQueens(char board[][],int row)
    {
        if (row==board.length)
            printBord(board);
        //column loop
        for (int j=0;j<board.length;j++)
        {
            board[row][j]='Q';
            nQueens(board,row+1);
            board[row][j]='.';
        }
    }
    public static void printBord(char board[][]){
        System.out.println("----chess----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.println(board[i][j]+" ");
            }

        }
    }
}
