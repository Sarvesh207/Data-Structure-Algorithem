package Revision.Arrays2D;



public class SprialTraversal {

    public static void sprialTraversal(int matrix [][]){
        int leftCol = 0;
        int rightCol = matrix[0].length-1;
        int topRow = 0;
        int bottomRow = matrix.length-1;

        while(leftCol <= rightCol && topRow <= bottomRow) {
            //top
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(matrix[topRow][i] + " ");
            }
            topRow++;

            //left

            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
            }
            rightCol--;

            //bottiom        }
            if (leftCol <= rightCol) {
                for (int i = rightCol; i >= leftCol; i--) {
                    System.out.print(matrix[bottomRow][i] + " ");
                }
                bottomRow--;
            }

            //left

            if (topRow <= bottomRow) {
                for (int i = bottomRow; i >= topRow; i--) {
                    System.out.print(matrix[i][leftCol]+" ");
                }
                leftCol++;
            }

        }
    }

    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            int n = 4;
            int m = 4;
            int matrix [][]  = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//            int matrix [][]  = {{1,2,3},{4,5,6,},{7,8,9},{10,11,12}};
            printMatrix(matrix);
            sprialTraversal(matrix);


        }

}
