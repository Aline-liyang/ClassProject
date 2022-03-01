/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tppassengernew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aline
 */
public class TPPassengerNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Passenger> passengerlist = new ArrayList<>();

        // Input the informatin of passengers
        System.out.println("how many passengers will you input?");
        int number = sc.nextInt();
        System.out.println("Input " + number + " passenger's infomation:");

        passengerlist = createPassengerList(number);

        // display all the information of passengers
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            System.out.println("which method you want to display the list? 1-while; 2-Enhance loop");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("The information of all the passengers is below:");
                    displyListWhile(passengerlist);
                    System.out.println("Whould you want to display again? y/n");
                    returnkey = sc.next();
                    break;
                }
                case 2: {
                    System.out.println("The information of all the passengers is below:");
                    System.out.println("The number of passenger: " + passengerlist.size());
                    displayListLoopEach(passengerlist);
                    System.out.println("Whould you want to display again? y/n");
                    returnkey = sc.next();
                    break;
                }

            }
        }

        // clear all the information
        System.out.println("Would you want to clear all passengers's information? y/n");
        String key = sc.next();
        deleteList(passengerlist, key);

    }

    public static List<Passenger> createPassengerList(int num) {

        List<Passenger> plist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= num; i++) {
            Passenger pas = new Passenger();
            System.out.println("Input this passenger's id:");
            pas.setId(sc.nextInt());
            System.out.println("Input this passenger's fistName:");
            pas.setFirstName(sc.next());
            System.out.println("Input this passenger's last name:");
            pas.setLastName(sc.next());
            System.out.println("Input this passenger's gender:");
            pas.setGender(sc.next());
            plist.add(pas);
            System.out.println("The No." + i + " passenger's info is added.");
        }

        return plist;
    }

    public static void displyListWhile(List<Passenger> listp1) {
        int j = 0;
        while (j <= listp1.size() - 1) {
            System.out.println("Index of the passenger: " + (j + 1));
            System.out.println("Id of this passenger: " + listp1.get(j).getId());
            System.out.println("Name of this passenger: " + listp1.get(j).getFirstName() + "  " + listp1.get(j).getLastName());
            System.out.println("Gender of this passenger: " + listp1.get(j).getGender());
            j++;
        }

    }

    public static void displayListLoopEach(List<Passenger> listp2) {
        for (Passenger pl : listp2) {
            System.out.println("Id of this passenger: " + pl.getId());
            System.out.println("Name of this passenger: " + pl.getFirstName() + "  " + pl.getLastName());
            System.out.println("Gender of this passenger: " + pl.getGender());
        }
    }

    public static void deleteList(List<Passenger> listp3, String y) {
        if (y.equalsIgnoreCase("y")) {
            listp3.clear();
            System.out.println("The number of passenger: " + listp3.size());
            System.out.println("All information is deleted.");

        }
    }
}
