package Prototype;

public class PrototypeMain {
    public static void main(String[] args) {


        Human human1 = new Human("Erwan", "Tutour", 30);

        Human human2 = (Human) human1.getClone();
        Human human3 = (Human) human1.getClone();

       Employee employee = new Employee("Edi", "Trean", 54, "police man");
     //  Employee employee2 = (Employee) employee.getClone();

      System.out.println(human1 + "\n" + human2+ "\n" + human3 + "\n"  );
    //    System.out.println(employee2);
    }
}