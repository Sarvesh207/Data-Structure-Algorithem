package Arrays2d;

public class Sprialmatrix {
    public static void printSprialMatrix(int arr [][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //left to right
            for(int i=startCol; i<=endCol; i++){
                System.out.print(arr[startRow][i]+" ");
            }
            startRow++;
            // top to down
            for(int i=startRow; i<=endRow; i++){
                System.out.print(arr[i][endCol]+" ");
            }endCol--;
            // right to left
            for(int i=endCol; i>=startCol; i--){
                System.out.print(arr[endRow][i]+" ");
            }
            endRow--;
            //down to top
            for(int i= endRow; i>=startRow; i--){
                System.out.print(arr[i][startCol]+" ");
            }
            startCol++;
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int matrix [][]  = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSprialMatrix(matrix);


    }
}

