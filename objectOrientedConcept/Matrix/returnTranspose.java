package objectOrientedConcept.Matrix;

    //WAP to convert a simple matrix into Transpose Matrix Using Extra Space.
/*
      Original Matrix           Transpose
      1 2 3                     1 4 7
      4 5 6                     2 5 8
      7 8 9                     3 6 9
 */
import java.util.Scanner;
public class returnTranspose {
    static void printMatrix(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] FindTranpose(int[][]matrix,int r,int c){
        int [][]ans=new int[r][c];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
               /* int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                */
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Row And column: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]matrix=new int[r][c];
        System.out.println("Enter "+ r*c +"Element");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrtrix:");
        printMatrix(matrix);
        System.out.println("Transpose Matrix: ");
        int [][]ans=FindTranpose(matrix, r, c);
        printMatrix(ans);
    }
}
