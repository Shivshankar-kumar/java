package arrayList.recursion;

//WAP to Multiply two Natural Number using recursion.

public class multiply {
    static int productOfTwoNaturalNumber(int n1,int n2){
        //Base Case
        if(n1==0 || n2==0) return 0;
        if(n2==1) return n1;
        return productOfTwoNaturalNumber(n1, (n2)-1)+n1;
    }
    public static void main(String[] args) {
        int ans=productOfTwoNaturalNumber(12, 14);
        System.out.println("product of TWO NATURAL NUMBER IS= "+" "+ans);
    }
}
