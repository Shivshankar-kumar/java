package arrayList.recursion;

//WAP to print all of subset of array element and sum can be any order.
//Input: arr[] ={1,2,3};
//Output: [0,1,5,3,3,2,4,6]

public class subSetSum {
  static void integerSubset(int []arr,int idx,int sum){
    //Base Case
    if(idx>=arr.length){
        System.out.println(sum);
        return;
    }
    //Recursive Function
    integerSubset(arr, idx+1, sum+arr[idx]);
    integerSubset(arr, idx+1, sum);
  }  
  public static void main(String[] args) {
    int arr[]={1,2,3};
    integerSubset(arr, 0, 0);
  }
}
