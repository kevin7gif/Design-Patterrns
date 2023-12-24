package com.kevin.xiehn.iterator;

import java.util.List;

/**
 * 具体迭代器角色类
 * @author kevin
 * @version 1.0
 * @date 2023-12-24 10:42
 */
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> list;
    private int position=0;// 用来记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position<list.size();
    }

    @Override
    public Student next() {
        // 获取当前位置的学生
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
