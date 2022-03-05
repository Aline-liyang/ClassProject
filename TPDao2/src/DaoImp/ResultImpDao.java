/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Course;
import model.Result;
import model.Student;

/**
 *
 * @author Aline
 */
public class ResultImpDao {

    Scanner sc = new Scanner(System.in);
    private List<Result> listResult;

    public ResultImpDao() {
        listResult = new ArrayList<Result>();
    }

    public void create() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            Student stu = new Student();
            Course cour = new Course();
            Result res = new Result();
            System.out.println("Input the student's ID: ");
            stu.setId(sc.nextInt());
            System.out.println("Input the student's first name: ");
            stu.setFirstName(sc.next());
            System.out.println("Input the student's last name: ");
            stu.setLastName(sc.next());
            System.out.println("Input the student's gender: ");
            stu.setGender(sc.next());
            res.setStudent(stu);
            System.out.println("Input the course No.: ");
            cour.setNo(sc.nextDouble());
            System.out.println("Input the course name: ");
            cour.setCourseName(sc.next());
            res.setCourse(cour);
            System.out.println("Input the first mark: ");
            double mark1 = sc.nextDouble();
            res.setMarks1(mark1);
            System.out.println("Input the second mark: ");
            double mark2 = sc.nextDouble();
            res.setMarks2(mark2);
            listResult.add(res);
            System.out.println("could you want to add another result? y/n");
            returnkey = sc.next();
        }
        System.out.println("-------------------------------------------");
    }

    public List<Result> findAll() {
        return listResult;
    }

    public void modify() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            if (listResult.isEmpty()) {
                System.out.println("This result list is empty.");
            } else {
                System.out.println("Would you like to modify the result by: ");
                System.out.println("1. Student ID.+ Course NO.");
                System.out.println("2. Student ID.+ Course Name");
                System.out.println("3. Student name.+ Course NO.");
                System.out.println("4. Student name.+ Course Name");
                System.out.println("please enter your choice.");
                int modifychoice = sc.nextInt();
                switch (modifychoice) {
                    case 1: {
                        Boolean var = true;
                        System.out.println("please enter the student ID.: ");
                        int id = sc.nextInt();
                        System.out.println("please enter the cours NO.: ");
                        double no = sc.nextDouble();
                        for (int i = 0; i < listResult.size(); i++) {
                            if ((listResult.get(i).getStudent().getId() == id) && (listResult.get(i).getCourse().getNo() == no)) {
                                System.out.println("This student's info is found.");
                                System.out.println("--------------------------------------------------");
                                System.out.println("Update the first mark <enter 1> or the second mark <enter 2> or both <enter 3>");
                                int modmark = sc.nextInt();
                                if (modmark == 1) {
                                    System.out.println("Modify the first mark:");
                                    double newmark1 = sc.nextInt();
                                    listResult.get(i).setMarks1(newmark1);
                                } else if (modmark == 2) {
                                    System.out.println("Modify the second mark:");
                                    double newmark2 = sc.nextInt();
                                    listResult.get(i).setMarks1(newmark2);
                                } else if (modmark == 3) {
                                    System.out.println("Modify the first mark:");
                                    double newmark1 = sc.nextInt();
                                    listResult.get(i).setMarks1(newmark1);
                                    System.out.println("Modify the second mark:");
                                    double newmark2 = sc.nextInt();
                                    listResult.get(i).setMarks1(newmark2);
                                }
                                System.out.println("This student's marks is modified!");
                                System.out.println("--------------------------------------------------");
                                System.out.println("Student ID: " + listResult.get(i).getStudent().getId() + "  " + "Student name: " + listResult.get(i).getStudent().getFirstName() + " " + listResult.get(i).getStudent().getLastName());
                                System.out.println("Course NO. " + listResult.get(i).getCourse().getNo() + "  " + "Course name: " + listResult.get(i).getCourse().getCourseName());
                                System.out.println("First mark: " + listResult.get(i).getMarks1() + "  " + "Second mark: " + listResult.get(i).getMarks2());
                                var = false;
                                break;
                            }
                        }

                        if (var) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Error: Input is wrong! please check your input.");
                            System.out.println("--------------------------------------------------");
                        }
                        break;
                    }

                    case 2: {
                        Boolean var = true;
                        System.out.println("please enter the student ID.: ");
                        int id = sc.nextInt();
                        System.out.println("please enter the cours name.: ");
                        String cname = sc.next();
                        for (int i = 0; i < listResult.size(); i++) {
                            if ((listResult.get(i).getStudent().getId() == id) && (listResult.get(i).getCourse().getCourseName().equalsIgnoreCase(cname))) {
                                System.out.println("This student's info is found.");
                                System.out.println("--------------------------------------------------");
                                System.out.println("Update the first mark <enter 1> or the second mark <enter 2> or both <enter 3>");
                                int modmark = sc.nextInt();
                                if (modmark == 1) {
                                    System.out.println("Modify the first mark:");
                                    double newmark1 = sc.nextInt();
                                    listResult.get(i).setMarks1(newmark1);
                                } else if (modmark == 2) {
                                    System.out.println("Modify the second mark:");
                                    double newmark2 = sc.nextInt();
                                    listResult.get(i).setMarks1(newmark2);
                                } else if (modmark == 3) {
                                    System.out.println("Modify the first mark:");
                                    double newmark1 = sc.nextInt();
                                    listResult.get(i).setMarks1(newmark1);
                                    System.out.println("Modify the second mark:");
                                    double newmark2 = sc.nextInt();
                                    listResult.get(i).setMarks1(newmark2);
                                }
                                System.out.println("This student's marks is modified!");
                                System.out.println("--------------------------------------------------");
                                System.out.println("Student ID: " + listResult.get(i).getStudent().getId() + "  " + "Student name: " + listResult.get(i).getStudent().getFirstName() + " " + listResult.get(i).getStudent().getLastName());
                                System.out.println("Course NO. " + listResult.get(i).getCourse().getNo() + "  " + "Course name: " + listResult.get(i).getCourse().getCourseName());
                                System.out.println("First mark: " + listResult.get(i).getMarks1() + "  " + "Second mark: " + listResult.get(i).getMarks2());
                                var = false;
                                break;
                            }
                        }

                        if (var) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Error: Input is wrong! please check your input.");
                            System.out.println("--------------------------------------------------");
                        }
                        break;
                    }

                }
            }
            System.out.println("could you want to modify another result? y/n");
            returnkey = sc.next();
        }

    }

    public void search() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            if (listResult.isEmpty()) {
                System.out.println("This result list is empty.");
            } else {
                System.out.println("Would you like to search the result by: ");
                System.out.println("1. Student ID.+ Course NO.");
                System.out.println("2. Student ID.+ Course Name");
                System.out.println("3. Student name.+ Course NO.");
                System.out.println("4. Student name.+ Course Name");
                System.out.println("please enter your choice.");
                int searchchoice = sc.nextInt();
                switch (searchchoice) {
                    case 1: {
                        Boolean var = true;
                        System.out.println("please enter the student ID.: ");
                        int id = sc.nextInt();
                        System.out.println("please enter the cours NO.: ");
                        double no = sc.nextDouble();
                        for (int i = 0; i < listResult.size(); i++) {
                            if ((listResult.get(i).getStudent().getId() == id) && (listResult.get(i).getCourse().getNo() == no)) {
                                System.out.println("This result's info is found.");
                                System.out.println("--------------------------------------------------");
                                System.out.println("Student ID: " + listResult.get(i).getStudent().getId() + "  " + "Student name: " + listResult.get(i).getStudent().getFirstName() + " " + listResult.get(i).getStudent().getLastName());
                                System.out.println("Course NO. " + listResult.get(i).getCourse().getNo() + "  " + "Course name: " + listResult.get(i).getCourse().getCourseName());
                                System.out.println("First mark: " + listResult.get(i).getMarks1() + "  " + "Second mark: " + listResult.get(i).getMarks2());
                                var = false;
                                break;
                            }
                        }

                        if (var) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Error: Input is wrong! please check your input.");
                            System.out.println("--------------------------------------------------");
                        }
                        break;
                    }

                    case 2: {
                        Boolean var = true;
                        System.out.println("please enter the student ID.: ");
                        int id = sc.nextInt();
                        System.out.println("please enter the cours name.: ");
                        String cname = sc.next();
                        for (int i = 0; i < listResult.size(); i++) {
                            if ((listResult.get(i).getStudent().getId() == id) && (listResult.get(i).getCourse().getCourseName().equalsIgnoreCase(cname))) {
                                System.out.println("This result's info is found.");
                                System.out.println("--------------------------------------------------");
                                System.out.println("Student ID: " + listResult.get(i).getStudent().getId() + "  " + "Student name: " + listResult.get(i).getStudent().getFirstName() + " " + listResult.get(i).getStudent().getLastName());
                                System.out.println("Course NO. " + listResult.get(i).getCourse().getNo() + "  " + "Course name: " + listResult.get(i).getCourse().getCourseName());
                                System.out.println("First mark: " + listResult.get(i).getMarks1() + "  " + "Second mark: " + listResult.get(i).getMarks2());
                                var = false;
                                break;
                            }
                        }

                        if (var) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Error: Input is wrong! please check your input.");
                            System.out.println("--------------------------------------------------");
                        }
                        break;
                    }

                }
            }
            System.out.println("could you want to modify another result? y/n");
            returnkey = sc.next();
        }

    }

    public void delete() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            if (listResult.isEmpty()) {
                System.out.println("This result list is empty.");
            } else {
                System.out.println("--------------------------------------------------");
                System.out.println("There are " + listResult.size() + " students in total.");
                System.out.println("--------------------------------------------------");
                System.out.println("Would you like to delete the result by: ");
                System.out.println("1. Student ID.+ Course NO.");
                System.out.println("2. Student ID.+ Course Name");
                System.out.println("3. Student name.+ Course NO.");
                System.out.println("4. Student name.+ Course Name");
                System.out.println("please enter your choice.");
                int deletechoice = sc.nextInt();
                switch (deletechoice) {

                    case 1: {
                        Boolean dlvar = false;
                        System.out.println("please enter the student ID.: ");
                        int id = sc.nextInt();
                        System.out.println("please enter the cours NO.: ");
                        double no = sc.nextDouble();
                        for (int i = 0; i < listResult.size(); i++) {
                            if ((listResult.get(i).getStudent().getId() == id) && (listResult.get(i).getCourse().getNo() == no)) {
                                System.out.println("This result's info is found.");
                                System.out.println("Student ID: " + listResult.get(i).getStudent().getId() + "  " + "Student name: " + listResult.get(i).getStudent().getFirstName() + " " + listResult.get(i).getStudent().getLastName());
                                System.out.println("Course NO. " + listResult.get(i).getCourse().getNo() + "  " + "Course name: " + listResult.get(i).getCourse().getCourseName());
                                System.out.println("First mark: " + listResult.get(i).getMarks1() + "  " + "Second mark: " + listResult.get(i).getMarks2());
                                listResult.remove(i);
                                dlvar = true;
                            }
                        }

                        int newsize = listResult.size();

                        if (newsize == 0) {
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("There is no result left, the result list is empty.");
                            System.out.println("The result of this student ID: " + id + " Course NO.: " + no + " is deleted.");
                            System.out.println("-------------------------------------------------------------------------");

                        } else {
                            Boolean var = true;
                            for (int i = 0; i < newsize; i++) {
                                if ((listResult.get(i).getStudent().getId() == id) && (listResult.get(i).getCourse().getNo() == no)) {
                                    System.out.println("Error: the result's info isn't deleted.");
                                    var = false;
                                    break;
                                }
                            }
                            if (var && dlvar) {
                                System.out.println("----------------------------------------------------------------------------");
                                System.out.println("Now there are " + newsize + " results left.");
                                System.out.println("The result of this student ID: " + id + " Course NO.: " + no + " is deleted.");
                                System.out.println("----------------------------------------------------------------------------");
                            }
                        }
                        if (!dlvar) {
                            System.out.println("-------------------------------------------------------");
                            System.out.println("Error: Student ID or Course NO is wrong! please check your input.");
                            System.out.println("-------------------------------------------------------");
                        }
                        break;
                    }

                    case 2: {
                        Boolean dlvar = false;
                        System.out.println("please enter the student ID.: ");
                        int id = sc.nextInt();
                        System.out.println("please enter the cours name.: ");
                        String dname = sc.next();
                        for (int i = 0; i < listResult.size(); i++) {
                            if ((listResult.get(i).getStudent().getId() == id) && (listResult.get(i).getCourse().getCourseName().equalsIgnoreCase(dname))) {
                                System.out.println("Student ID: " + listResult.get(i).getStudent().getId() + "  " + "Student name: " + listResult.get(i).getStudent().getFirstName() + " " + listResult.get(i).getStudent().getLastName());
                                System.out.println("Course NO. " + listResult.get(i).getCourse().getNo() + "  " + "Course name: " + listResult.get(i).getCourse().getCourseName());
                                System.out.println("First mark: " + listResult.get(i).getMarks1() + "  " + "Second mark: " + listResult.get(i).getMarks2());
                                listResult.remove(i);
                                dlvar = true;
                            }
                        }

                        int newsize = listResult.size();

                        if (newsize == 0) {
                            System.out.println("-------------------------------------------------------------------------------------");
                            System.out.println("There is no result left, the result list is empty");
                            System.out.println("The result of this student ID: " + id  + " " + " Course name :" +dname+ " is deleted.");
                            System.out.println("--------------------------------------------------------------------------------------");

                        } else {
                            Boolean var = true;
                            for (int i = 0; i < newsize; i++) {
                                if ((listResult.get(i).getStudent().getId() == id) && (listResult.get(i).getCourse().getCourseName().equalsIgnoreCase(dname))) {
                                    System.out.println("Error: the result's info isn't deleted.");
                                    var = false;
                                    break;
                                }
                            }
                            if (var && dlvar) {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Now there are " + newsize + " results left.");
                               System.out.println("The result of this student ID: " + id + " Course name.: " + dname + " is deleted.");
                                System.out.println("---------------------------------------------------------------------------------");
                            }
                        }
                        if (!dlvar) {
                            System.out.println("----------------------------------------------------------------------");
                            System.out.println("Error: Student ID or Course name is wrong! please check your input.");
                            System.out.println("----------------------------------------------------------------------");
                        }
                        break;

                    }

                }
            }
            System.out.println("could you want to delete another result? y/n");
            returnkey = sc.next();

        }
    }
}
