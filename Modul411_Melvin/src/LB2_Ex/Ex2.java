package LB2_Ex;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Ex2 {
    public static void main (String[] args){
        packlisteSpiel();
        carqueue();
        guests();
    }

    public static void packlisteSpiel(){
        Stack<String> packListe = new Stack<>();
        packListe.add("Ich packe in meinen Koffer …");
        packListe.add("und nehme mit ein Apfel");

        packListe.add("Ich packe in meinen Koffer …");
        packListe.add("und nehme mit ein Apfel");
        packListe.add("und nehme mit ein Tasche");

        for (String item: packListe
        ) {
            System.out.println(item);
        }
    }

    public static void carqueue(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(4);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }

    public static void guests(){
        Queue<String> queue = new LinkedList<>();
        queue.offer("EOEO");
        queue.offer("OPO");
        queue.offer("GUGG");
        queue.offer("ZTUT");

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }

    public static void terms(){}
}
