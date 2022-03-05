/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;
import model.Course;

/**
 *
 * @author Aline
 */
public interface InterfaceCourse {

    void create(Course course);

    void delete();

    List<Course> findAll();

    void modify();

    double search();

}
