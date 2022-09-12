package com.xiaozheng.crud.service;

import com.xiaozheng.crud.entity.Student;

import java.util.List;

public interface StudentService {
    //查询所有
    List<Student> getAll();
    //根据id删除
    void deleteById(Integer id);

    Student findById(Integer id);

    void update(Student student);

    void insert(Student student);
}
