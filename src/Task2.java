import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int tableLength;
        double sum = 0;
        DecimalFormat df2 = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        //Table length from user input
        System.out.println("Please enter integer number");
        tableLength = scanner.nextInt();
        //Creating table and filling it in with numbers provided by user
        int[] numbers = new int[tableLength];
        System.out.println("Please enter " + tableLength + " numbers.");
        for (int i = 0; i < tableLength; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Calculating average
        for (int j = 0; j < numbers.length; j++) {
            sum = sum + numbers[j];
        }
        double average = sum / numbers.length;
        System.out.println("Average of numbers that you provided is: " + df2.format(average));
        // Finding the biggest number
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Biggest number provided: " + max);
    }
}