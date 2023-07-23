import java.util.Scanner;
public class Count{
        public static int CheckWord(String a){
        String test = a;
        int cnt = 0;
        int error = 0;
        int identifier=77;
        if (Character.isAlphabetic(a.charAt(0)) || a.charAt(0) == '_') { cnt++; } //Check if first symbol fits the requirenments. If not, the word is not identifier 
        for (int i = 1; i < test.length(); i++) {
            if (Character.isAlphabetic(a.charAt(i)) == false && 
                Character.isDigit(test.charAt(i)) == false && 
                test.charAt(i) != '_'){ 
                    error++; }
        }

        if (cnt == 0) { identifier=0; }
        else if (cnt != 0 && error > 0) { identifier= 0; }
        else if (cnt != 0 && error == 0) { identifier=1; }

        return identifier;        
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line;
        int cnt=0;
        while (in.hasNextLine() && !(line = in.nextLine()).isEmpty()) {
            String[] test=line.split(" ");
            for(String a:test){
                if(CheckWord(a)==1){cnt++;}
            }
            System.out.println(cnt);
            cnt=0; //Reset counter of identifiers for every line.
        }
    in.close();
    }
}