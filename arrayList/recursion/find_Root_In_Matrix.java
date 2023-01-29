package arrayList.recursion;

public class find_Root_In_Matrix {
    public static int Number_of_Path(int i,int j,int m,int n){
        //Base Case
        if(i==m && j==n) return 0;
        if(i>=m-1 || j>=n-1) return 1;
        //Recursive Work/Sub Problem
        return Number_of_Path(i, j+1, m, n) + Number_of_Path(i+1, j, m, n);
    }
    public static void main(String[] args) {
        int ans=Number_of_Path(0, 0,1,1);
        System.out.println("Total Path To Reach [m-1][n-1]= "+ans);
    }
}
