package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class task18 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}

class Person implements RepkaItem {
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person person) {
        System.out.println(this.name + " as " + person.getNamePadezh());
    }
}

interface RepkaItem {
    String getNamePadezh();

    void pull(Person person);
}

class RepkaStory {
    static void tell(List<Person> items) {
        for (int i = items.size() - 1; i > 0; i--) {
            Person first = items.get(i - 1);
            Person second = items.get(i);
            first.pull(second);
        }
    }
}
