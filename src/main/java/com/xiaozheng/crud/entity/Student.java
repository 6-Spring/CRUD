package com.xiaozheng.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 郑元龙
 * @description: Student实体类
 * @date 2022年09月12日 19:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private String  sex;
}
