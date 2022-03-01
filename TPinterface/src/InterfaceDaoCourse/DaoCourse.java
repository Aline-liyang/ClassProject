/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDaoCourse;

import java.util.List;
import model.Course;

/**
 *
 * @author Aline
 */
public interface DaoCourse {

    void create(Course course);

    List<Course> findAll();

    int search(int no);
    
    List<Course> remove(int no);

}
