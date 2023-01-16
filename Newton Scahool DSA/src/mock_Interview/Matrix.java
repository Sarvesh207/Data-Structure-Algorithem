package mock_Interview;
/*Problem 3: Given an n x n matrix and a number x, find the position of x in the matrix if it is present in it. Otherwise, print “Not Found”. In the given matrix, every row and column is sorted in increasing order. The designed algorithm should have linear time complexity (Big-O complexity O(N)).

Input: mat[4][4] = { {10, 20, 30, 40},

{15, 25, 35, 45},

{27, 29, 37, 48},

{32, 33, 39, 50}};

x = 29

Output: Found at (2, 1)

Explanation: Element at (2,1) is 29
**/

public class Matrix {
    static void  findEl(int matrix [][], int target){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==target){
                    System.out.print("found at index ("+i+","+j+")");
                }
            }
        }

    }
    //1nd approch
    static void Serach(int matrix [][], int target){
        int n = matrix.length;
        int i = 0;
        int j = n-1;
        while(i < n && j>=0){
            if(matrix[i][j]==target){
                System.out.println("found at index "+i+","+j);
                return;
            }else if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("not found");
        return;
    }
    public static void main(String[] args) {
        int matrix [][] = { {10, 20, 30, 40},

        {15, 25, 35, 45},

        {27, 29, 37, 48},

        {32, 33, 39, 50}};
        int target = 29;
        //findEl(matrix, target);
        Serach(matrix, target);

    }
}
