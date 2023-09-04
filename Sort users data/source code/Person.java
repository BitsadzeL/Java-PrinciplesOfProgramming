public class Person {
    private String name;
    private int age;
    private int id;

    //Constructor
    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void info(){
        System.out.println(this.name+" "+this.age+" "+this.id);
    }
}
