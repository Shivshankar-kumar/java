package arrayList.recursion;

public class factorial {
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String args[]){
        int ans=Factorial(6);
        System.out.println(ans);
    }
}
