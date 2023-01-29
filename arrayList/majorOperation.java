package arrayList;
import java.util.ArrayList;
public class majorOperation {
    static void printElement(ArrayList<Integer>List){
        for(int i=0; i<List.size(); i++){
            System.out.print(List.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        List.add(12);
        List.add(10);
        List.add(14);
        List.add(126);
        List.add(123);
        List.add(120);
        printElement(List);
        List.add(3,100);
        System.out.println();
        System.out.println(List);
        System.out.println(List.get(3));
        System.out.println(List.get(1));
    }
}
