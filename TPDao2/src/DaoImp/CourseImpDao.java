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

/**
 *
 * @author Aline
 */
public class CourseImpDao {

    Scanner sc = new Scanner(System.in);
    private List<Course> listCourse;

    public CourseImpDao() {
        listCourse = new ArrayList<Course>();
    }

    public void create() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            Course cour = new Course();
            System.out.println("Input the course No.: ");
            cour.setNo(sc.nextDouble());
            System.out.println("Input the course name: ");
            cour.setCourseName(sc.next());
            listCourse.add(cour);
            System.out.println("could you want to add another course? y/n");
            returnkey = sc.next();
        }
        System.out.println("-------------------------------------------");
    }

    public List<Course> findAll() {
        return listCourse;
    }

    public void search() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            if (listCourse.isEmpty()) {
                System.out.println("This course list is empty.");
            } else {
                System.out.println("Would you like to search the course by: ");
                System.out.println("1. Course No.");
                System.out.println("2. Course name");
                System.out.println("please enter your choice.(1/2)");
                int searchchoice = sc.nextInt();
                switch (searchchoice) {
                    case 1: {
                        Boolean var = true;
                        System.out.println("please enter the course No.: ");
                        double no = sc.nextDouble();
                        for (int i = 0; i < listCourse.size(); i++) {
                            if (listCourse.get(i).getNo() == no) {
                                System.out.println("The info of this course is found.");
                                System.out.println("Course No.: " + listCourse.get(i).getNo() + "  " + "Course name: " + listCourse.get(i).getCourseName());
                                var = false;
                                break;
                            }
                        }
                        if (var) {
                            System.out.println("Error: Course No. is wrong! please check your intput.");
                        }
                        break;
                    }

                    case 2: {
                        Boolean var = true;
                        System.out.println("please enter the course Name: ");
                        String name = sc.next();
                        for (int i = 0; i < listCourse.size(); i++) {
                            if (listCourse.get(i).getCourseName().equalsIgnoreCase(name)) {
                                System.out.println("The info of this course is found.");
                                System.out.println("Course No.: " + listCourse.get(i).getNo() + "  " + "Course name: " + listCourse.get(i).getCourseName());
                                var = false;
                                break;
                            }
                        }
                        if (var) {
                            System.out.println("Error: Course Name is wrong! please check your intput.");
                        }
                        break;
                    }

                }
            }
            System.out.println("could you want to search another course? y/n");
            returnkey = sc.next();
        }
    }

    public void modify() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            if (listCourse.isEmpty()) {
                System.out.println("This course list is empty.");
            } else {
                System.out.println("Would you like to modify the course by: ");
                System.out.println("1. Course No.");
                System.out.println("2. Course name");
                System.out.println("please enter your choice.(1/2)");
                int modifychoice = sc.nextInt();
                switch (modifychoice) {
                    case 1: {
                        Boolean var = true;
                        System.out.println("please enter the course No.: ");
                        double no = sc.nextDouble();
                        for (int i = 0; i < listCourse.size(); i++) {
                            if (listCourse.get(i).getNo() == no) {
                                System.out.println("The info of this course is found.");
                                System.out.println("please modify the info of this course: ");
                                System.out.println("Input the course No.: ");
                                listCourse.get(i).setNo(sc.nextDouble());
                                System.out.println("Input the course name: ");
                                listCourse.get(i).setCourseName(sc.next());
                                System.out.println("The info of this course is modified!");
                                var = false;
                                break;
                            }
                        }
                        if (var) {
                            System.out.println("Error: Course No. is wrong! please check your intput.");
                        }
                        break;
                    }

                    case 2: {
                        Boolean var = true;
                        System.out.println("please enter the course name: ");
                        String name = sc.next();
                        for (int i = 0; i < listCourse.size(); i++) {
                            if (listCourse.get(i).getCourseName().equalsIgnoreCase(name)) {
                                System.out.println("The info of this course is found.");
                                System.out.println("please modify the info of this course: ");
                                System.out.println("Input the course No.: ");
                                listCourse.get(i).setNo(sc.nextDouble());
                                System.out.println("Input the course name: ");
                                listCourse.get(i).setCourseName(sc.next());
                                System.out.println("The info of this course is modified!");
                                var = false;
                                break;
                            }
                        }
                        if (var) {
                            System.out.println("Error: Course name is wrong! please check your intput.");
                        }
                        break;
                    }
                }
            }
            System.out.println("could you want to modify another course? y/n");
            returnkey = sc.next();
        }

    }
    

    public void delete() {
        String returnkey = "y";
        while (returnkey.equalsIgnoreCase("y")) {
            if (listCourse.isEmpty()) {
                System.out.println("This course list is empty.");
            } else {
                System.out.println("There are " + listCourse.size() + " courses in total.");
                System.out.println("-------------------------------------------");
                System.out.println("Would you like to delete the course by: ");
                System.out.println("1. Course No.");
                System.out.println("2. Course name");
                System.out.println("please enter your choice.(1/2)");
                int deletechoice = sc.nextInt();
                switch (deletechoice) {
                    case 1: {
                        Boolean dlvar = false;
                        System.out.println("please enter the course No.: ");
                        double no = sc.nextDouble();
                        for (int i = listCourse.size() - 1; i >= 0; i--) {
                            if (listCourse.get(i).getNo() == no) {
                                System.out.println("The info of this course will be deleted:  Course No.: " + listCourse.get(i).getNo() + "  " + "Course name: " + listCourse.get(i).getCourseName());
                                listCourse.remove(i);
                                dlvar = true;
                            }
                        }

                        int newsize = listCourse.size();

                        if (newsize == 0) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Now no course left, this course list is empty.");
                            System.out.println("The info of this course No.: " + no + " is deleted.");

                        } else {
                            Boolean var = true;
                            for (int i = 0; i < newsize; i++) {
                                if (listCourse.get(i).getNo() == no) {
                                    System.out.println("Error: the course's info isn't deleted.");
                                    var = false;
                                    break;
                                }
                            }
                            if (var && dlvar) {
                                System.out.println("--------------------------------------------------");
                                System.out.println("Now there are " + newsize + " courses left.");
                                System.out.println("The info of this course No.: " + no + " is deleted.");
                            }

                        }
                        if (!dlvar) {
                            System.out.println("Error: Course NO. is wrong! please check your input.");
                        }
                        break;

                    }

                    case 2: {
                        Boolean dlvar = false;
                        System.out.println("please enter the course name: ");
                        String delname = sc.next();
                        for (int i = listCourse.size() - 1; i >= 0; i--) {
                            if (listCourse.get(i).getCourseName().equalsIgnoreCase(delname)) {
                                System.out.println("The info of this course will be deleted:  Course No.: " + listCourse.get(i).getNo() + "  " + "Course name: " + listCourse.get(i).getCourseName());
                                listCourse.remove(i);
                                dlvar = true;
                            }
                        }

                        int newsize = listCourse.size();

                        if (newsize == 0) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Now no course left, this course list is empty.");
                            System.out.println("The info of this course name.: " + delname + " is deleted.");

                        } else {
                            Boolean var = true;
                            for (int i = 0; i < newsize; i++) {
                                if (listCourse.get(i).getCourseName().equalsIgnoreCase(delname)) {
                                    System.out.println("Error: the course's info isn't deleted.");
                                    var = false;
                                    break;
                                }
                            }
                            if (var && dlvar) {
                                System.out.println("--------------------------------------------------");
                                System.out.println("Now there are " + newsize + " courses left.");
                                System.out.println("The info of this course name: " + delname + " is deleted.");
                            }

                        }
                        if (!dlvar) {
                            System.out.println("Error: Course name is wrong! please check your input.");
                        }
                        break;

                    }

                }

            }
            System.out.println("could you want to delete another course? y/n");
            returnkey = sc.next();

        }

    }
}
