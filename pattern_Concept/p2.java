package pattern_Concept;

public class p2 {
    public static void main(String[] args) {
        int n=7;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0||j==n-1 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||j==0||i==(n-1)/2 ||i==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0||j==n-1||i==(n-1)/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0||j==n-1 || i+j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
