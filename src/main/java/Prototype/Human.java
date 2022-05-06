package Prototype;

public class Human implements Prototype {

    String name;
    String lastName;
    int age;

    public Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human: " +
                "name'" + name + '\'' +
                ", lastName'" + lastName + '\'' +
                ", age" + age;
    }


    @Override
    public Prototype getClone() {
        return new Human(name,lastName,age);
    }
}
