public class Nqueens {
    public static int count;
    public static boolean isSafe(char arr[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;j--,i--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int i){
        if(i==board.length){
            //printBoard(board);
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, i, j)){
            board[i][j]='Q';
            nQueens(board,i+1);
            board[i][j]='.';
        }
    }
    }
    public static void printBoard(char arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=4;
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        nQueens(arr, 0);
        System.out.println(count);
    }
}
