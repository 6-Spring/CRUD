package com.xiaozheng.crud.service.impl;

import com.xiaozheng.crud.entity.Student;
import com.xiaozheng.crud.mapper.StudentMapper;
import com.xiaozheng.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 郑元龙
 * @description: TODO
 * @date 2022年09月12日 19:27
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    //查询所有
    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }
    //根据id删除
    @Override
    public void deleteById(Integer id) {
        studentMapper.deleteById(id);
    }

    @Override
    public Student findById(Integer id) {
        return studentMapper.findById(id);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }
}
