package objectOrientedConcept.Array2_D;
import java.util.Scanner;
public class revArray {
    static void arrPrint(int[]array){
        for(int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
        static void reverse(int[] array,int n){
            int l=0,r=n-1;
            while(l<r){
                array[l]=array[r];
                l++;
                r--;
            }
        }
        public static void main(String []args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Size: ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter "+ n +"Elements");
            for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
                }
                System.out.println("Origonal Array: ");
                arrPrint(arr);
                System.out.println("reverse Array:");
                reverse(arr,n);
        }
    }
