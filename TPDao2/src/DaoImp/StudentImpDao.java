/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author Aline
 */
public class StudentImpDao {

    Scanner sc = new Scanner(System.in);
    private List<Student> listStudent;

    public StudentImpDao() {
        listStudent = new ArrayList<Student>();
    }

    public void create() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            Student stu = new Student();
            System.out.println("Input the student's ID: ");
            stu.setId(sc.nextInt());
            System.out.println("Input the student's first name: ");
            stu.setFirstName(sc.next());
            System.out.println("Input the student's last name: ");
            stu.setLastName(sc.next());
            System.out.println("Input the student's gender: ");
            stu.setGender(sc.next());
            listStudent.add(stu);
            System.out.println("could you want to add another student? y/n");
            returnkey = sc.next();
        }
        System.out.println("-------------------------------------------");
    }

    public void delete() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            if (listStudent.isEmpty()) {
                System.out.println("This student list is empty.");
            } else {
                System.out.println("--------------------------------------------------");
                System.out.println("There are " + listStudent.size() + " students in total.");
                System.out.println("--------------------------------------------------");
                System.out.println("Would you like to delete the student by: ");
                System.out.println("1. Student ID.");
                System.out.println("2. Student name");
                System.out.println("please enter your choice.(1/2)");
                int deletechoice = sc.nextInt();
                switch (deletechoice) {

                    case 1: {
                        Boolean dlvar = false;
                        System.out.println("please enter the student ID.: ");
                        int id = sc.nextInt();
                        for (int i = listStudent.size() - 1; i >= 0; i--) {
                            if (listStudent.get(i).getId() == id) {
                                System.out.println("This student's info is found.");
                                System.out.println("This student's info will be deleted:  Student ID: " + listStudent.get(i).getId() + "  " + "Student's name: " + listStudent.get(i).getFirstName() + " " + listStudent.get(i).getLastName() + "  " + "Student's gender: " + listStudent.get(i).getGender());
                                listStudent.remove(i);
                                dlvar = true;
                            }
                        }

                        int newsize = listStudent.size();

                        if (newsize == 0) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("There is no student left, the student list is empty.");
                            System.out.println("The info of this student ID: " + id + " is deleted.");
                            System.out.println("--------------------------------------------------");
                            
                        } else {
                            Boolean var = true;
                            for (int i = 0; i < newsize; i++) {
                                if (listStudent.get(i).getId() == id) {
                                    System.out.println("Error: the student's info isn't deleted.");
                                    var = false;
                                    break;
                                }
                            }
                            if (var && dlvar) {
                                System.out.println("--------------------------------------------------");
                                System.out.println("Now there are " + newsize + " students left.");
                                System.out.println("The info of this student ID: " + id + " is deleted.");
                                System.out.println("--------------------------------------------------");
                            }
                        }
                        if (!dlvar) {
                            System.out.println("-------------------------------------------------------");
                            System.out.println("Error: Student ID. is wrong! please check your input.");
                            System.out.println("-------------------------------------------------------");
                        }
                        break;
                    }

                    case 2: {
                        Boolean dlvar = false;
                        System.out.println("please enter the student name: ");
                        System.out.println("First name: ");
                        String fname = sc.next();
                        System.out.println("Last name: ");
                        String lname = sc.next();
                        for (int i = listStudent.size() - 1; i >= 0; i--) {
                            if (listStudent.get(i).getFirstName().equalsIgnoreCase(fname) && listStudent.get(i).getLastName().equalsIgnoreCase(lname)) {
                                System.out.println("This student's info is found.");
                                System.out.println("This student's info will be deleted:  Student ID: " + listStudent.get(i).getId() + "  " + "Student's name: " + listStudent.get(i).getFirstName() + " " + listStudent.get(i).getLastName() + "  " + "Student's gender: " + listStudent.get(i).getGender());
                                listStudent.remove(i);
                                dlvar = true;
                            }
                        }

                        int newsize = listStudent.size();

                        if (newsize == 0) {
                            System.out.println("--------------------------------------------------------");
                            System.out.println("There is no student left, the student list is empty.");
                            System.out.println("The info of this student name: " + fname + " " + lname + " is deleted.");
                             System.out.println("-------------------------------------------------------");

                        } else {
                            Boolean var = true;
                            for (int i = 0; i < newsize; i++) {
                                if (listStudent.get(i).getFirstName().equalsIgnoreCase(fname) && listStudent.get(i).getLastName().equalsIgnoreCase(lname)) {
                                    System.out.println("Error: the student's info isn't deleted.");
                                    var = false;
                                    break;
                                }
                            }
                            if (var && dlvar) {
                                System.out.println("--------------------------------------------------------");
                                System.out.println("Now there are " + newsize + " students left.");
                                System.out.println("The info of this student name: " + fname + " " + lname + " is deleted.");
                                 System.out.println("-------------------------------------------------------");
                            }
                        }
                        if (!dlvar) {
                            System.out.println("-------------------------------------------------------");
                            System.out.println("Error: Student name is wrong! please check your input.");
                            System.out.println("-------------------------------------------------------");
                        }
                        break;

                    }

                }
            }
            System.out.println("could you want to delete another student? y/n");
            returnkey = sc.next();

        }
    }

    public void search() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            if (listStudent.isEmpty()) {
                System.out.println("This student list is empty.");
            } else {
                System.out.println("Would you like to search the student by: ");
                System.out.println("1. Student ID.");
                System.out.println("2. Student name");
                System.out.println("please enter your choice.(1/2)");
                int searchchoice = sc.nextInt();
                switch (searchchoice) {
                    case 1: {
                        Boolean var = true;
                        System.out.println("please enter the student ID.: ");
                        int id = sc.nextInt();
                        for (int i = 0; i < listStudent.size(); i++) {
                            if (listStudent.get(i).getId() == id) {
                                System.out.println("This student's info is found.");
                                System.out.println("--------------------------------------------------");
                                System.out.println("Student ID: " + listStudent.get(i).getId() + "  " + "Student's name: " + listStudent.get(i).getFirstName() + " " + listStudent.get(i).getLastName() + "  " + "Student's gender: " + listStudent.get(i).getGender());
                                System.out.println("--------------------------------------------------");
                                var = false;
                                break;
                            }
                        }
                        if (var) {
                            System.out.println("---------------------------------------------------");
                            System.out.println("Error: student Id is wrong! please check your input");
                            System.out.println("---------------------------------------------------");
                        }
                        break;
                    }

                    case 2: {
                        Boolean var = true;
                        System.out.println("please enter the student name: ");
                        System.out.println("First name: ");
                        String fname = sc.next();
                        System.out.println("Last name: ");
                        String lname = sc.next();
                        for (int i = 0; i < listStudent.size(); i++) {
                            if (listStudent.get(i).getFirstName().equalsIgnoreCase(fname) && listStudent.get(i).getLastName().equalsIgnoreCase(lname)) {
                                System.out.println("This student's info is found.");
                                System.out.println("--------------------------------------------------");
                                System.out.println("Student ID: " + listStudent.get(i).getId() + "  " + "Student's name: " + listStudent.get(i).getFirstName() + " " + listStudent.get(i).getLastName() + "  " + "Student's gender: " + listStudent.get(i).getGender());
                                System.out.println("--------------------------------------------------");
                                var = false;
                                break;
                            }
                        }
                        if (var) {
                            System.out.println("---------------------------------------------------");
                            System.out.println("Error: student name is wrong, please check the name.");
                            System.out.println("---------------------------------------------------");
                        }
                        break;
                    }
                }
            }
            System.out.println("could you want to search another student? y/n");
            returnkey = sc.next();
        }

    }

    public List<Student> findAll() {
        return listStudent;
    }

    public void modify() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            if (listStudent.isEmpty()) {
                System.out.println("This student list is empty.");
            } else {
                System.out.println("Would you like to modify the student by: ");
                System.out.println("1. Student ID.");
                System.out.println("2. Student name");
                System.out.println("please enter your choice.(1/2)");
                int modifychoice = sc.nextInt();
                switch (modifychoice) {
                    case 1: {
                        Boolean var = true;
                        System.out.println("please enter the student ID.: ");
                        int id = sc.nextInt();
                        for (int i = 0; i < listStudent.size(); i++) {
                            if (listStudent.get(i).getId() == id) {
                                System.out.println("This student's info is found.");
                                System.out.println("--------------------------------------------------");
                                System.out.println("please modify this student's info: ");
                                System.out.println("Input this sutdent's id: ");
                                listStudent.get(i).setId(sc.nextInt());
                                System.out.println("Input this sutdent's first name: ");
                                listStudent.get(i).setFirstName(sc.next());
                                System.out.println("Input this sutdent's last name: ");
                                listStudent.get(i).setLastName(sc.next());
                                System.out.println("Input this sutdent's gender: ");
                                listStudent.get(i).setGender(sc.next());
                                System.out.println("This student's info is modified!");
                                System.out.println("--------------------------------------------------");
                                System.out.println("Student ID: " + listStudent.get(i).getId() + "  " + "Student name: " + listStudent.get(i).getFirstName() + " " + listStudent.get(i).getLastName() + "  " + "Student gender: " + listStudent.get(i).getGender());
                                System.out.println("--------------------------------------------------");
                                var = false;
                                break;
                            }
                        }
                        if (var) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Error: student Id is wrong! please check your input.");
                            System.out.println("--------------------------------------------------");
                        }
                        break;
                    }

                    case 2: {
                        Boolean var = true;
                        System.out.println("please enter the student name: ");
                        System.out.println("First name: ");
                        String fname = sc.next();
                        System.out.println("Last name: ");
                        String lname = sc.next();
                        for (int i = 0; i < listStudent.size(); i++) {
                            if (listStudent.get(i).getFirstName().equalsIgnoreCase(fname) && listStudent.get(i).getLastName().equalsIgnoreCase(lname)) {
                                System.out.println("This student's info is found.");
                                System.out.println("please modify this student's info: ");
                                System.out.println("Input this sutdent's id: ");
                                listStudent.get(i).setId(sc.nextInt());
                                System.out.println("Input this sutdent's first name: ");
                                listStudent.get(i).setFirstName(sc.next());
                                System.out.println("Input this sutdent's last name: ");
                                listStudent.get(i).setLastName(sc.next());
                                System.out.println("Input this sutdent's gender: ");
                                listStudent.get(i).setGender(sc.next());
                                System.out.println("--------------------------------------------------");
                                System.out.println("This student's info is modified!");
                                System.out.println("Student ID: " + listStudent.get(i).getId() + "  " + "Student name: " + listStudent.get(i).getFirstName() + " " + listStudent.get(i).getLastName() + "  " + "Student gender: " + listStudent.get(i).getGender());
                                System.out.println("--------------------------------------------------");
                                var = false;
                                break;
                            }
                        }
                        if (var) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Error: student name is wrong! please check your name.");
                            System.out.println("--------------------------------------------------");
                        }
                        break;
                    }

                }
            }
            System.out.println("could you want to modify another student? y/n");
            returnkey = sc.next();
        }
    }
}
