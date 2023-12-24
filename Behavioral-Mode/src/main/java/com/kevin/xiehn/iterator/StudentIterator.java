package com.kevin.xiehn.iterator;

/**
 * 抽象迭代器角色
 * @author kevin
 * @version 1.0
 * @date 2023-12-24 10:38
 */
public interface StudentIterator {

    // 判断是否还有元素
    boolean hasNext();

    // 获取下一个元素
    Student next();
}
