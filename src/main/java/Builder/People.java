package Builder;

public class People {

    private String name;
    private String lastName;
    private int age;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public People(PeopleBuilder peopleBuilder) {
        if (peopleBuilder == null) {
            throw new IllegalArgumentException();
        }

        this.name = peopleBuilder.name;
        this.lastName = peopleBuilder.lastName;
        this.age = peopleBuilder.age;
        this.address = peopleBuilder.address;

    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;

    }

    public boolean hasAge() {
        return this.age >= 0;
    }

    public void happyBirthday() {
        if (this.hasAge()) {
            this.age = age++;
        }
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name= '" + name + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", age=" + age +
                ", address= '" + address + '\'';
    }
}
