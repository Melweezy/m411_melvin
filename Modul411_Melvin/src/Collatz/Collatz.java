package Collatz;

import java.util.ArrayList;
import java.util.Scanner;

public class Collatz {

    public static void main(String[] args){
        int number = InputReader();
        ArrayList<Integer> numbers = CollatzAlgo(number);
        OutputHandler(numbers);
        System.out.println("Finished!");
    }

    public static ArrayList<Integer> CollatzAlgo(int number) {
        ArrayList<Integer> numbers = new ArrayList<>();

        while (number > 1){
            if (number % 2 == 0){
                number /= 2;
            } else {
                number = 3 * number + 1;
            }
            numbers.add(number);
        }
        return numbers;
    }

    private static Integer InputReader(){
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter number");
        return Integer.parseInt(inputScanner.nextLine());
    }

    private static void OutputHandler(ArrayList<Integer> numbers){
        for (int number: numbers
             ) {
            System.out.print(number  + ",");
        }
    }
}
