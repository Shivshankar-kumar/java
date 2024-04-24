package sorting_Algorithm;

public class string_Sort_lexicoGraphical {
    static void lexicoGraphical(String[]fruits){
        int n=fruits.length;
        for(int i=0; i<n-1; i++){
            int min_idx=i;
            for(int j=i+1; j<n; j++){
                if(fruits[j].compareTo(fruits[min_idx])<0){
                    String temp=fruits[j];
                    fruits[j]=fruits[min_idx];
                    fruits[min_idx]=temp;
                }
            }
        }
        for(String str: fruits){
            System.out.print(str+",");
        }
    }
    public static void main(String[] args) {
        String []str={"lime","pineapple","gauva","apple","mango","kiwi"};
        lexicoGraphical(str);
    }
}
