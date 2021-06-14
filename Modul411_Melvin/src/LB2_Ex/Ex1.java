package LB2_Ex;

import java.util.Random;
import java.util.TreeSet;

public class Ex1 {
    public static void main(String[] args){
        Random rnd = new Random();
        int min = 1;
        int max = 42;
        TreeSet<Integer> lottoZahlen = new TreeSet<>();
        for (int i = 0; i < 6; i++){
            int lottoZahl = rnd.nextInt(max - min + 1) + min;
            lottoZahlen.add(lottoZahl);
        }
        int gluecksZahl = rnd.nextInt(6);
        System.out.println("Lottozahlen:  " + lottoZahlen);
        System.out.println("Glückszahl:  " + gluecksZahl) ;
    }
}
