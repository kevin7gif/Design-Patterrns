package com.kevin.xiehn.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合角色类
 * @author kevin
 * @version 1.0
 * @date 2023-12-24 10:50
 */
public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> list=new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list) ;
    }
}
