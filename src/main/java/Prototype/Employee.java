package Prototype;

public class Employee extends Human {


    protected String profession;

    public Employee(String name, String lastName, int age, String profession) {
        super(name, lastName, age);
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
