package arrayList.Sorting_Method;

public class asecending_Order {
    void printArray(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
        void is_Sorted(int []arr,int n){
            for(int i=0; i<n-1; i++){
                for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
            printArray(arr);
            }
        public static void main(String[] args) {
            int arr[]={34,21,11,55,2,3,4};
            int n=arr.length;
            asecending_Order sc=new asecending_Order();
            System.out.println("Orginal Array Element:");
            sc.printArray(arr);
            System.out.println("\nAscending Order: ");
            sc.is_Sorted(arr,n);
        }
    }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the Size of Array:");
//     int n=sc.nextInt();
//     int []arr=new int[n];
//     System.out.println("Enter the "+n+" "+"Elements");
//     for(int i=0; i<n; i++){
//         arr[i]=sc.nextInt();
//     }
//     for(int i=0; i<n-1; i++){
//         for(int j=0; j<n-i-1; j++){
//         if(arr[j]>arr[j+1]){
//             int temp=arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;
//         }
//     }
// }
//         System.out.println("Ascending Order:");
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


