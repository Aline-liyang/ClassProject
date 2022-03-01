/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tparraylistclassaddmodifydelete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aline
 */
public class TPArraylistClassAddModifyDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentlist = new ArrayList<>();
        int choice;
        int no = 0;
        String keyreturn = "y";
        while (keyreturn.equalsIgnoreCase("y")) {
            System.out.println("welcome to student's system menu!");
            System.out.println("1: add one new student's infomation in our system ");
            System.out.println("2: show the information of all the students in our system ");
            System.out.println("3: delete one student's infomation in our system ");
            System.out.println("4: modify one student's infomation in our system ");
            System.out.println("5: exit the system");
            System.out.println("please choose the number:");
            choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    Student stu = new Student();
                    no = no + 1;
                    stu.setNo(no);
                    System.out.println("Input this student's first name:");
                    sc.nextLine();
                    stu.setFirstName(sc.nextLine());
                    System.out.println("Input this student's last name:");
                    stu.setLastName(sc.next());
                    System.out.println("Input this student's gender:");
                    stu.setGender(sc.next());
                    studentlist.add(stu);
                    System.out.println("This student's info is added.");
                    System.out.println("Press <Enter> to return to the main menu");
                    sc.nextLine();
                    sc.nextLine();
                    keyreturn = "y";
                    break;
                }

                case 2: {
                    System.out.println("The information of all the students is below:");
                    studentlist.forEach((list) -> {
                        System.out.println("Student NO: " + list.getNo() + "  " + "Student Name: " + list.getFirstName() + "  " + list.getLastName() + "  " + "Student gender:" + list.getGender());
                    });
                    System.out.println("Press <Enter> to return to the main menu");
                    sc.nextLine();
                    sc.nextLine();
                    keyreturn = "y";
                    break;
                }

                case 3: {
                    System.out.println("Delete one student's infomation in our system ");
                    System.out.println("Input the student No that you want to delete");
                    int dlnum = sc.nextInt();
                    for (int i = 0; i < studentlist.size(); i++) {
                        if (studentlist.get(i).getNo() == dlnum) {
                            studentlist.remove(i);
                            System.out.println("The infomation of student No:" + dlnum + "  is deleted");
                            i--;
                        }
                    }
                    System.out.println("Press <Enter> to return to the main menu");
                    sc.nextLine();
                    sc.nextLine();
                    keyreturn = "y";
                    break;

                }

                case 4: {
                    System.out.println("Modify one student's infomation in our system ");
                    System.out.println("Input the student No that you want to modify");
                    int dlnum = sc.nextInt();
                    for (Student list : studentlist) {
                        if (list.getNo() == dlnum) {
                            System.out.println("what do you need to modify? a:name; b:gender");
                            String j = sc.next();
                            switch (j) {

                                case "a": {
                                    System.out.println("please re-type the first name:");
                                    sc.nextLine();
                                    list.setFirstName(sc.nextLine());
                                    System.out.println("please re-type the last name:");
                                    list.setLastName(sc.next());
                                    break;
                                }
                                case "b": {
                                    System.out.println("please re-type the gender:");
                                    list.setGender(sc.next());
                                    break;
                                }

                            }
                            System.out.println("This student's infomation is modified in our system ");
                            System.out.println("Student NO: " + list.getNo() + "  " + "Student Name: " + list.getFirstName() + "  " + list.getLastName() + "  " + "Student gender:" + list.getGender());

                        }

                    }
                    System.out.println("Press <Enter> to return to the main menu");
                    sc.nextLine();
                    sc.nextLine();
                    keyreturn = "y";

                    break;

                }

                case 5: {
                    System.out.println("You are leaving this sytem");
                    keyreturn = "n";
                    break;
                }

                default: {
                    System.out.println("Input number is wrong, please choose the number again");
                    System.out.println("Press <Enter> to return to the main menu");
                    sc.nextLine();
                    sc.nextLine();
                    keyreturn = "y";
                    break;
                }

            }
        }
    }

}
