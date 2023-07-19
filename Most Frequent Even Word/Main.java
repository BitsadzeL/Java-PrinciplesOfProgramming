import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<String> words=new ArrayList<String>();
        String word;
        int maxfreq=0;
        int currentfreq=0;
        while(in.hasNext()){
            word=in.nextLine();
            if(word.length()%2==0){
                words.add(word);
            }
        }
        in.close();



        for(int i=0;i<words.size();i++)
        for(int j=i+1;j<words.size();j++)
        if (words.get(i).compareTo(words.get(j))>0)
        {
            String temp;
            temp=words.get(i);
            words.set(i,words.get(j));
            words.set(j,temp);
        }        


        if(words.size()==0){maxfreq=0;currentfreq=0;}
        currentfreq = 1; 
        for(int i = 0; i < words.size()-1; i++)
        {
                if (words.get(i).compareTo(words.get(i+1))==0) {currentfreq++;}
                else
                {
                        if (currentfreq > maxfreq) maxfreq = currentfreq;
                        currentfreq=1;
                }
        }


        /*
        for(String a: words){
            System.out.println(a);
        }
        */
        System.out.println(maxfreq);


    }

}