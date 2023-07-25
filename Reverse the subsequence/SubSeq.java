import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SubSeq{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,low,high,num,subStart=0;
        n=in.nextInt();
        low=in.nextInt();
        high=in.nextInt();
        int[] main=new int[n];
        ArrayList<Integer> sub=new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            num=in.nextInt();
            main[i]=num;
            if(num>=low && num<=high){
                sub.add(num);
            }
        }

        Collections.reverse(sub);

        for(int i=0;i<n;i++){
            if(main[i]>=low && main[i]<=high){
                int c=sub.get(subStart);
                main[i]=c;
                subStart++;
            }

        }
        for(int mem:main){
            System.out.print(mem+" ");
        }
        in.close();
    }
}