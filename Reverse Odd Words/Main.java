import java.util.Scanner;
import java.util.ArrayList;
public class Main{
     public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<String> even= new ArrayList<String>();
        ArrayList<String> odd= new ArrayList<String>();
        String s;
        while(in.hasNext()){
            s=in.nextLine();
            if(s.length()%2==0){
                even.add(s);
            } else if(s.length()%2==1){
                odd.add(s);
            }

        }

        for(String a : even){
            System.out.println(a);
        }

        for(int i=0;i<odd.size();i++){
            StringBuilder reversed = new StringBuilder(odd.get(i));
            reversed.reverse();
            odd.set(i, reversed.toString());
            System.out.println(odd.get(i));
        }
        
    }
}