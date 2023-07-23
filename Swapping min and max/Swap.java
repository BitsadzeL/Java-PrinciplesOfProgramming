import java.util.Scanner;
public class Swap{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int[] numbers=new int[n];
        int min=numbers[0];
        int max=numbers[0];
        for(int i=0;i<n;i++){
            numbers[i]=in.nextInt();
        }
        in.close();

        for(int i=0;i<n;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }

        }

        for(int i=0;i<n;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }     
        
        for(int i=0;i<n;i++){
            if(numbers[i]==min){
                numbers[i]=max;
            } else if(numbers[i]==max){
                numbers[i]=min;
            }
        }        

        for(int num: numbers){
            System.out.print(num+" ");
        }
    }
}