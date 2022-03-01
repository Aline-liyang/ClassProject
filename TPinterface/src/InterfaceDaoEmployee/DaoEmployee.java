/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDaoEmployee;

import java.util.List;
import model.Course;
import model.Employee;

/**
 *
 * @author Aline
 */
public interface DaoEmployee {

    void create(Employee employee);

    List<Employee> findAll();

    int search(String lastname);

    List<Employee> remove(String name);

}
