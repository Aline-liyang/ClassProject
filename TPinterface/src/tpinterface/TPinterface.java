/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpinterface;

import CourseImpDao.CourseImpDao;
import EmployeeImpDao.EmployeeImpDao;
import InterfaceDaoCourse.DaoCourse;
import StudentImpDao.StudentImpDao;
import java.util.List;
import java.util.Scanner;
import model.Course;
import model.Employee;
import model.Student;

/**
 *
 * @author Aline
 */
public class TPinterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // pratice Student
        Scanner sc = new Scanner(System.in);
        StudentImpDao dao = new StudentImpDao();
        Student stu1 = new Student("li", "yang");
        dao.create(stu1);
        Student stu2 = new Student("haochong", "zhao");
        dao.create(stu2);
        Student stu3 = new Student("zz", "xin");
        dao.create(stu3);

        List<Student> liste1 = dao.findAll();
        for (Student s : liste1) {
            System.out.println("First Name: " + s.getFirstName() + "  " + "Last Name: " + s.getLastName());
        }

        int a;
        System.out.println("which last name do you search?");
        a = dao.search(sc.next());
        System.out.println("First Name: " + liste1.get(a).getFirstName() + "  " + "Last Name: " + liste1.get(a).getLastName());

        // practice Course
        // CourseImpDao daoCourse = new CourseImpDao();
        // create course list
        DaoCourse daoCourse = new CourseImpDao();
        /*Course cour1 = new Course(1, "english");
        daoCourse.create(cour1);
        Course cour2 = new Course(2, "math");
        daoCourse.create(cour2);
        Course cour3 = new Course(3, "french");
        daoCourse.create(cour3); */

        System.out.println("Create one course list? y/n");
        String choicecourse = sc.next();
        switch (choicecourse) {
            case "y": {
                String returnkey = "y";
                while (returnkey.equalsIgnoreCase("y")) {
                    Course cour = new Course();
                    System.out.println("Input the course No:");
                    cour.setCourseNo(sc.nextInt());
                    System.out.println("Input the course Name:");
                    cour.setCourseName(sc.next());
                    daoCourse.create(cour);
                    System.out.println("could you want to add another course? y/n");
                    returnkey = sc.next();
                }

                break;
            }

            case "no": {
                System.out.println("No course is added");
                break;
            }

        }

        // show all the course
        List<Course> listc = daoCourse.findAll();
        int size = listc.size();
        System.out.println("There are total " + size + " courses");
        for (Course c : listc) {
            System.out.println("Course No: " + c.getCourseNo() + "  " + "Course Name: " + c.getCourseName());
        }

        // search course
        int b;
        System.out.println("which course do you search?");
        b = daoCourse.search(sc.nextInt());
        System.out.println("Course No: " + listc.get(b).getCourseNo() + "  " + "Course Name: " + listc.get(b).getCourseName());

        //delete course
        System.out.println("which course do you want to delete? No.");
        int n = sc.nextInt();
        List<Course> listcnew = daoCourse.remove(n);
        int size1 = listcnew.size();
        System.out.println("There are total " + size1 + " courses");
        for (Course f : listcnew) {
            System.out.println("Course No: " + f.getCourseNo() + "  " + "Course Name: " + f.getCourseName());
        }
        System.out.println("Cours NO: " + n + " is deleted");

        // Pratice employee
        // create employee list
        EmployeeImpDao daoEmployee = new EmployeeImpDao();

        Employee emp1 = new Employee("marie", "wang");
        daoEmployee.create(emp1);
        Employee emp2 = new Employee("luc", "zhang");
        daoEmployee.create(emp2);
        Employee emp3 = new Employee("sophy", "yan");
        daoEmployee.create(emp3);

        // show employee list
        List<Employee> liste = daoEmployee.findAll();
        int sizeE = liste.size();
        System.out.println("There are total " + sizeE + " employees");
        for (Employee e : liste) {
            System.out.println("Employee's FirstName: " + e.getFirstName() + "  " + "Employee's LastName: " + e.getLastName());
        }

        // search one employee 
        int e1;
        System.out.println("which last name do you search?");
        e1 = daoEmployee.search(sc.next());
        System.out.println("First Name: " + liste.get(e1).getFirstName() + "  " + "Last Name: " + liste.get(e1).getLastName());

        //delete one employee
        System.out.println("which employee do you want to delete? lastname:");
        String dlname = sc.next();
        List<Employee> listenew = daoEmployee.remove(dlname);
        int sizeenew = listenew.size();
        System.out.println("There are total " + sizeenew + " courses");
        for (Employee enew : listenew) {
            System.out.println("Employee's FirstName: " + enew.getFirstName() + "  " + "Employee's LastName: " + enew.getLastName());
        }
        System.out.println("The employee: " + dlname + " is deleted");
    }

}
