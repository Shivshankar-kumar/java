package arrayList.recursion;
//WAP to calculate power of p And Q where p^q,, USing Recursion. stack height is O(N).
public class calculatePower {
    public static int power(int p,int q){
        //Base/Halting condition
        if(p==0){
            return 0;
        }
        if(q==0){
            return 1;
        }
        //SubProblem
        return p*power(p,q-1);
    }
    public static void main(String[] args) {
       int ans= power(2, 5);
       System.out.println("Total 2^5="+ans);
    }
}
