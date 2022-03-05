/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;
import model.Student;

/**
 *
 * @author Aline
 */
public interface InterfaceStudent {

    void create(Student student);

    void delete();

    void search();

    List<Student> findAll();

    void modify();

}
