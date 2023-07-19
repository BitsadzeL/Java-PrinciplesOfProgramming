import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    

    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Person> people=new ArrayList<Person>();

        while(cin.hasNext()){
            String name;
            String agestr;
            int age;
            name=cin.next();
            agestr=cin.next();
            age=Integer.parseInt(agestr);
            Person p=new Person(name,age);
            people.add(p);
        }
        int n=people.size();

        Collections.sort(people, Comparator.comparing(Person::getage));


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
              if (people.get(i).getage() == people.get(j).getage()){
                    if((people.get(i).getname()).compareTo(people.get(j).getname())>0) {
                        Person temp=new Person();
                        temp.setage(people.get(i).getage());
                        temp.setname(people.get(i).getname());
                

                        people.get(i).setage(people.get(j).getage());
                        people.get(i).setname(people.get(j).getname());
                        
                        
                        people.get(j).setage(temp.getage());
                        people.get(j).setname(temp.getname());


                    }
                }
            }
        }        
        
        /*
        for(Person p : people){
                p.print();
        }
        */
                
        if(n%2==1){
            System.out.println(people.get(n/2).getname()+" "+people.get(n/2).getage());
        }
        else{
            System.out.println(people.get(n/2-1).getname()+" "+people.get(n/2-1).getage());
            System.out.println(people.get(n/2).getname()+" "+people.get(n/2).getage());

        }
        
        cin.close();
    }
}
