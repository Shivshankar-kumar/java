package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class revArrayList{
    static void rev(ArrayList<Integer>list){
        //Integer l=Integer.valueOf(0);
        //Integer r=Integer.valueOf(list.size()-1);
        int l=0,r=list.size()-1;
        while(l<r){
           // Integer temp= Integer.valueOf(list.get(l));
           int temp=list.get(l);
            list.set(l,list.get(r));
            list.set(r,temp);
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size:");
        int n=sc.nextInt();
        ArrayList<Integer> li= new ArrayList<>();
        System.out.println("Enter the Element:");
        for(int i=0; i<n; i++){
            li.add(i);
        }
        System.out.println("Original Element:"+ li);
        rev(li);
        System.out.println("Reverse Element: "+ li);
    }
}