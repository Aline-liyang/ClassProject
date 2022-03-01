/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeImpDao;

import InterfaceDaoEmployee.DaoEmployee;
import java.util.ArrayList;
import java.util.List;
import model.Employee;

/**
 *
 * @author Aline
 */
public class EmployeeImpDao implements DaoEmployee {

    private List<Employee> listEmployee;

    public EmployeeImpDao() {
        listEmployee = new ArrayList<Employee>();

    }

    public void create(Employee employee) {
        listEmployee.add(employee);
    }

    public List<Employee> findAll() {
        return listEmployee;
    }

    public int search(String name) {

        int ne = 0;

        for (int i = 0; i < listEmployee.size(); i++) {

            if (listEmployee.get(i).getLastName().equals(name)) {
                ne = i;
            }
        }

        return ne;

    }

    public List<Employee> remove(String name) {

        for (int i = listEmployee.size() - 1; i >= 0; i--) {

            if (listEmployee.get(i).getLastName().equals(name)) {
                listEmployee.remove(i);

            }

        }

        return listEmployee;

    }

    /* public List<Employee> remove(String name) {
        for (Employee el : listEmployee) {
            if (el.getLastName().equals(name)) {
                listEmployee.remove(el);
                break;
            }
        }
        
        return listEmployee; 
        
    }*/
    
    
}
