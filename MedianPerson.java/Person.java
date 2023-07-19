public class Person {
    private
        String name;
        int age;

    public Person(){}
    public Person(String n, int a){this.name=n; this.age=a;}
    public  int getage(){return age;}
    public String getname(){return name;}
    public void print(){System.out.println(name+" "+age);}
    public void setname(String s){this.name=s;}
    public void setage(int a){this.age=a;}
}
