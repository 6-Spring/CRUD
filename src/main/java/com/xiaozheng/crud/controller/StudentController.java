package com.xiaozheng.crud.controller;

import com.xiaozheng.crud.entity.Student;
import com.xiaozheng.crud.service.StudentService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 郑元龙
 * @description: TODO
 * @date 2022年09月12日 19:26
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //查询所有
    @GetMapping("getAll")
    public List<Student> getAll(){
        return studentService.getAll();
    }
    //根据id删除
    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        studentService.deleteById(id);
    }
    //根据ID查找一个学生
    @GetMapping("findById/{id}")
    public Student findById(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }
    //更新student信息
    @PostMapping("updateById")
    public void updateById(@RequestBody Student student){
        studentService.update(student);
    }
    //新增
    @PostMapping("addStu")
    public void insertStu(@RequestBody  Student student){
        studentService.insert(student);
    }
}
