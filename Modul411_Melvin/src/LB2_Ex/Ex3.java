package LB2_Ex;

import java.util.HashMap;

public class Ex3 {
    public static void main(String[] args){
        HashMap<String, Integer> countries = new HashMap<>();
        countries.put("CH", 8);
        countries.put("DE", 85);
        System.out.println(countries.get("CH"));
    }
}
