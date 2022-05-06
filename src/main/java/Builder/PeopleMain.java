package Builder;

public class PeopleMain {

    public static void main(String[] args) {
        People mom = new PeopleBuilder()
                .name("Анна")
                .lastName("Вольф")
                .age(31)
                .address("Сидней")
                .build();
        System.out.println("Mom" + mom);

        People momWithoutAge = new PeopleBuilder()
                .name("Анна")
                .lastName("Вольф")
                .address("Сидней")
                .build();
        System.out.println("Mom" + momWithoutAge);

        try {
            People momWithoutName = new PeopleBuilder()
                    .lastName("Вольф")
                    .address("Сидней")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            People momNegativeAge = new PeopleBuilder()
                    .name("Анна")
                    .lastName("Вольф")
                    .age(-31)
                    .address("Сидней")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}