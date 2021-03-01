package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {

    static Scanner scanner = new Scanner(System.in);

    public static String getFilename() {
        scanner.reset();

        System.out.println("Please enter the filename:");
        String filname = scanner.next();

        return filname;
    }

    public static List<Integer> getParamNumbers(){
        scanner.reset();
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Please enter number of coupon:");
        numbers.add( scanner.nextInt());

        System.out.println("Please enter the type number:");
        numbers.add(scanner.nextInt());

        return numbers;
    }
}
