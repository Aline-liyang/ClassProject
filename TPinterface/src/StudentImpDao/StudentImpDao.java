/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentImpDao;

import InterfaceDao.Dao;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author Aline
 */
public class StudentImpDao implements Dao {

    private List<Student> listStudent;

    public StudentImpDao() {
        listStudent = new ArrayList<Student>();
    }

    public void create(Student student) {
        listStudent.add(student);
    }

    public List<Student> findAll() {
        return listStudent;
    }

    public int search(String name) {
        int no = 0;

        for (int i = 0; i < listStudent.size(); i++) {

            if (listStudent.get(i).getLastName().equals(name)) {
                no = i;
            }
        }

        return no;
    }

}
