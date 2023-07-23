import java.util.Scanner;
public class Reverse{
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
        
        Scanner in= new Scanner(System.in);
        String line;
        String result;
        while(in.hasNextLine() && !(line=in.nextLine()).isEmpty()){
            String[] words=line.split(" ");
            StringBuilder test=new StringBuilder(""); //To reverse identifier
            result="";
            for(String a : words){
                if(CheckWord(a)==1){
                    test.append(a);
                    test.reverse();
                    result+=test+" ";    
                    test.delete(0, test.length()); // empty test, so new word is not added every time to the old one.
                } 
                
                else if(CheckWord(a)==0){
                    result+=a+" ";
                }

                
            }
            
            System.out.println(result.trim());
            //result="";


        }
        in.close();

    }
}