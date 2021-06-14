package LB2_Ex;

import java.io.*;
import java.util.Scanner;

public class TestEx {
    public static void main(String[] args){
      a1();
      a2();
      a3();
      a4();
      a5();
      a6();
      a7();
    }

    public static void a1(){
        System.out.println("Aufgabe 1 / swap");
        String[] staedte = {"Genf", "Bern", "Chur", "Lugano", "Zürich"};
        System.out.println(java.util.Arrays.toString(staedte));
        swap(staedte, 0, 4);
        System.out.println(java.util.Arrays.toString(staedte));
    }

    public static void swap(String[] arr, int pos1, int pos2){
        String temp = "";
        temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
    public static void a2() throws IOException {
        System.out.println("Aufgabe 2 / readFile");
        String dateiName = "weisheiten.txt";
        readFile(dateiName);
    }

    public static void readFile(String dateiName) throws IOException {
        try (Scanner scanner = new Scanner(new File(dateiName), "UTF-8")) {

            BufferedWriter myWriter = new BufferedWriter(new FileWriter(dateiName, false));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException eIO) {
            System.out.println("Folgender Fehler trat auf: " + eIO);
        }
    }

    public static void a3(){

    }
    public static void a4(){

    }
    public static void a5(){

    }
    public static void a6(){

    }
    public static void a7(){

    }
}
