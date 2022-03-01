/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseImpDao;

import InterfaceDaoCourse.DaoCourse;
import java.util.ArrayList;
import java.util.List;
import model.Course;

/**
 *
 * @author Aline
 */
public class CourseImpDao implements DaoCourse {

    private List<Course> listCourse;

    public CourseImpDao() {
        listCourse = new ArrayList<Course>();

    }

    public void create(Course course) {
        listCourse.add(course);
    }

    public List<Course> findAll() {
        return listCourse;
    }

    public int search(int no) {

        int j = 0;

        for (int i = 0; i < listCourse.size(); i++) {

            if (listCourse.get(i).getCourseNo() == no) {
                j = i;
            }
        }

        return j;

    }

    public List<Course> remove(int no) {

        for (int i = 0; i < listCourse.size(); i++) {

            if (listCourse.get(i).getCourseNo() == no) {
                listCourse.remove(i);
                i--;
            }

        }

        return listCourse;

    }
}
