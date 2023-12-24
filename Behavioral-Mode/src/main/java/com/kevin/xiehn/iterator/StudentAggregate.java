package com.kevin.xiehn.iterator;

/**
 * 抽象聚合角色类
 * @author kevin
 * @version 1.0
 * @date 2023-12-24 10:48
 */
public interface StudentAggregate {
    // 添加学生功能
    void addStudent(Student student);

    // 删除学生功能
    void removeStudent(Student student);

    // 获取迭代器对象功能
    StudentIterator getStudentIterator();
}
