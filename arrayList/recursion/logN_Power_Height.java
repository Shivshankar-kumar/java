package arrayList.recursion;

public class logN_Power_Height {
    public static int logN_Power(int p,int q){
        //Base / Halting Condition
        if(p==0) return 0;
        if(q==0) return 1;
        //Sub/recursive problem
        if(q%2==0){
        return logN_Power(p, q/2)*logN_Power(p, q/2);
    }
    else{
        return logN_Power(p, q/2)*logN_Power(p, q/2)*p;
    }
}
public static void main(String[] args) {
    int ans=logN_Power(5, 4);
    System.out.println("Power is 5^4="+ans);
}
}
