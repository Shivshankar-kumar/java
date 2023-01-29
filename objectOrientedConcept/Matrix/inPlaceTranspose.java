package objectOrientedConcept.Matrix;
  //WAP to convert a simple matrix into Transpose Matrix in Place without Using Extra Space.
/*
      Original Matrix           Transpose
      1 2 3                     1 4 7
      4 5 6                     2 5 8
      7 8 9                     3 6 9
 */
import java.util.Scanner;
public class inPlaceTranspose {
    static void printMatrix(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void findTranpose(int [][]matrix,int r,int c){
        for(int i=0; i<r; i++){
            for(int j=i; j<c; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Row And Column: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]matrix=new int[r][c];
        System.out.println("Enter"+r*c+ " Elements");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix");
        printMatrix(matrix);
        findTranpose(matrix, r, c);
        System.out.println("Transpose Matrix:");
        printMatrix(matrix);
    }
}
