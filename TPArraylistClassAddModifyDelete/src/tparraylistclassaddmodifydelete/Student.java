/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tparraylistclassaddmodifydelete;

/**
 *
 * @author Aline
 */
public class Student {
    private int no;
    private String firstName;
    private String lastName;
    private String gender;

    public Student() {

    }

    public Student(int no, String firstName, String lastName, String gender) {
        this.no = no;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    
    

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
}
