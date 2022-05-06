package Singleton;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainSingleton {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Run the program");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        logger.log("Ask the user to enter the input data for the list");

        System.out.print("\nEnter the size of the list : ");
        int listSize = scanner.nextInt();
        logger.log("The size of the list : " + listSize);

        System.out.print("\nEnter the upper bound of the values of the element in the list : ");
        int highBorder = scanner.nextInt();
        logger.log("The upper bound of the values of the element in the list : " + highBorder);

        List<Integer> allValues = Arrays.asList(new Integer[listSize]);
        logger.log("Creating and filling the list");



        for (int i = 0; i < listSize; i++) {
            int randomInt = random.nextInt(highBorder);
            allValues.set(i, randomInt);
        }

        logger.log("The list: " + allValues);

        logger.log("Enter the value for filter");

        System.out.print("\nEnter the value for filter : ");
        int digitF = scanner.nextInt();
        logger.log("The value for filter : " + digitF);

        logger.log("Start filtering");

        Filter filter = new Filter(digitF);
        List<Integer> result = filter.filterOut(allValues);
        logger.log("The size of new list: " + result.size());


        logger.log("List: " + result);
        logger.log("End program.");

        logger.showLog();

    }
}

