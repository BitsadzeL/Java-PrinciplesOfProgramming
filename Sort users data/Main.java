import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String name;
        String line;
        int age;
        int id;

        while (in.hasNextLine() && !(line = in.nextLine()).isEmpty()) {
            String[] data = line.split(" ");
            name = data[0];
            age = Integer.parseInt(data[1]);
            id = Integer.parseInt(data[2]);
            Person p = new Person(name, age, id);
            people.add(p);
            data = new String[0];
        }

        in.close();

        for (int i = 0; i < people.size(); i++) {
            for (int j = i + 1; j < people.size(); j++) {
                if (people.get(i).getAge() > people.get(j).getAge()) {
                    Person temp = new Person(
                        people.get(j).getName(),
                        people.get(j).getAge(),
                        people.get(j).getId()
                    );

                    // Swap values
                    people.get(j).setName(people.get(i).getName());
                    people.get(j).setAge(people.get(i).getAge());
                    people.get(j).setId(people.get(i).getId());

                    people.get(i).setName(temp.getName());
                    people.get(i).setAge(temp.getAge());
                    people.get(i).setId(temp.getId());
                }
            }
        }

        for (int i = 0; i < people.size(); i++) {
            for (int j = i + 1; j < people.size(); j++) {
                if (people.get(i).getAge() == people.get(j).getAge() &&
                    people.get(i).getId() > people.get(j).getId()) {
                    Person temp = new Person(
                        people.get(j).getName(),
                        people.get(j).getAge(),
                        people.get(j).getId()
                    );


                    people.get(j).setName(people.get(i).getName());
                    people.get(j).setAge(people.get(i).getAge());
                    people.get(j).setId(people.get(i).getId());

                    people.get(i).setName(temp.getName());
                    people.get(i).setAge(temp.getAge());
                    people.get(i).setId(temp.getId());
                }
            }
        }

        for (Person p : people) {
            p.info();
        }
    }
}


