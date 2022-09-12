package com.xiaozheng.crud.mapper;

import com.xiaozheng.crud.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
    //查询所有
    List<Student> getAll();

    void deleteById(Integer id);

    Student findById(Integer id);

    void update(Student student);

    void insert(Student student);
}
