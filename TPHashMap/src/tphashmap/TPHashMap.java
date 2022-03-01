/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tphashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Aline
 */
public class TPHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String returnkey = "y";

        while (returnkey.equalsIgnoreCase("y")) {

            System.out.println(" A list of country");
            System.out.println(" 1. Canada");
            System.out.println(" 2. China");
            System.out.println(" 3. Japan");
            System.out.println(" 4. France");
            System.out.println(" 5. Poland");
            System.out.println("Please choose the country:  ");
            String country = sc.next();

            Map<String, String> capital = new HashMap<>();
            capital.put("Canada", "Ottawa");
            capital.put("China", "Beijing");
            capital.put("Japan", "Tokyo");
            capital.put("France", "Paris");
            capital.put("Poland", "Warsaw");

            capital.entrySet().stream().filter((cap) -> (cap.getKey().equalsIgnoreCase(country))).forEachOrdered((cap) -> {
                System.out.println("The capital of " + country + " is:  "
                        + cap.getValue());
            });
            System.out.println("cousld you want to continue to choose the country? y/n");
            returnkey = sc.next();
        }
            System.out.println("you are leaving the system.");
    }
}
