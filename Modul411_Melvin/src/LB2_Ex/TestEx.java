package LB2_Ex;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

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
    public static void a2(){
        System.out.println("Aufgabe 2 / readFile");
        String dateiName = "weisheiten.txt";
        readFile(dateiName);
    }

    public static void readFile(String dateiName){
        String filePath = "src/LB2_Ex/" + dateiName;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void a3(){
        System.out.println("Aufgabe 3 / createHashMap");
        String dateiName = "weisheiten.txt";
        HashMap<Integer, String> hmWisdom = createHashMap(dateiName);
        if (hmWisdom != null) {
            System.out.println(hmWisdom.toString());
        }
    }

    public static HashMap createHashMap(String dateiName){
        String filePath = "src/LB2_Ex/" + dateiName;
        HashMap<Integer, String> hmWisdom = new HashMap<>();
        int counter = 1;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(!line.contains("Aut")){
                    hmWisdom.put(counter, line);
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hmWisdom;
    }

    public static void a4(){
        System.out.println("Aufgabe 4 / printWisdom");
        String dateiName = "weisheiten.txt";
        HashMap<Integer, String> hmWisdom = createHashMap(dateiName);
        printWisdom(hmWisdom);
        printWisdom(hmWisdom);
    }

    public static void printWisdom(HashMap<Integer, String> hmWisdom){
        Random rnd = new Random();
        int rndKey = rnd.nextInt(6);
        Object[] values = hmWisdom.values().toArray();
        System.out.println(values[rndKey]);
    }

    public static void a5(){
        System.out.println("Aufgabe 5 / arraySumme");
        int[] zahlen = {2, 5, 1, 6, 9, 3};
        System.out.println(Arrays.toString(zahlen));
        for (int i = 0; i < zahlen.length; i++) {
            int summe = arraySumme(zahlen, i);  // rekursive Funktion
            System.out.println(i + " --> " + summe);
        }
    }

    public static int arraySumme(int[] array, int i){
        if (i <= 0)
            return 0;
        return (arraySumme(array, i - 1) + array[i - 1]);
    }

    public static void a6(){
        System.out.println("Aufgabe 6 / lottotipp");
        lottotipp();
    }
    public static void lottotipp(){
        Random rnd = new Random();
        int min = 1;
        int max = 42;
        TreeSet<Integer> lottoZahlen = new TreeSet<>();
        for (int i = 0; i < 6; i++){
            int lottoZahl = rnd.nextInt(max - min + 1) + min;
            lottoZahlen.add(lottoZahl);
        }
        int gluecksZahl = (int) Math.floor(rnd.nextInt(6));
        System.out.println("Lottozahlen:  " + lottoZahlen);
        System.out.println("Glückszahl:  " + gluecksZahl) ;
    }
    public static void a7(){
        System.out.println("Aufgabe 7 / replaceVowel");
        String sentence = "Während Adam lacht, jagen zwölf Boxkämpfer Eva quer über …";
        System.out.println(sentence);  // mit ä, ö, ü
        sentence = replaceVowel(sentence);
        System.out.println(sentence);  // ohne ä, ö, ü
    }

    public static String replaceVowel(String sentence){
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {

            if(sentence.charAt(i) == 'ä'){
                newStr.append("ae");
            } else if(sentence.charAt(i) == 'ö') {
                newStr.append("oe");
            } else if(sentence.charAt(i) == 'ü') {
                newStr.append("ue");
            } else {
                newStr.append(sentence.charAt(i));
            }
        }
        return newStr.toString();
    }
}
