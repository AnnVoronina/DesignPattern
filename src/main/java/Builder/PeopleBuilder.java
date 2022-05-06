package Builder;

public class PeopleBuilder {

    protected String name;
    protected String lastName;
    protected int age;
    protected String address;

public PeopleBuilder() {
    super();
}
public PeopleBuilder name (String name) {
    this.name = name;
    return this;
}

    public PeopleBuilder lastName (String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PeopleBuilder age (int age){
    this.age = age;
    return this;
    }

    public PeopleBuilder address (String address) {

        this.address = address;
        return this;
    }

    public People build(){
    People person = null;
    if (validatePerson()){
        person = new People(this);
    } else System.out.println("You can't create person without Name and last name or with negative age.");
    return person;
    }

    private boolean validatePerson() {
    return (name.trim().isEmpty() && lastName.trim().isEmpty() && age>=0);
        //.trim удаляет пробелы в начале и конце строки
    }


}
