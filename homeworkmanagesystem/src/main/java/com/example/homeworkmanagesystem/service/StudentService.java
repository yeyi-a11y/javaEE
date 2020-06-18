package com.example.homeworkmanagesystem.service;

import com.example.homeworkmanagesystem.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Student)表服务接口
 *
 * @author makejava
 * @since 2020-06-18 14:50:39
 */
public interface StudentService {

    /**
     * 通过ID查询单条数据
     *
     * @param name 姓名
     * @param password 密码
     * @return 实例对象
     */
    Student query(String name, String password);

    /**
     * 通过name查询单条数据
     *
     * @param name 姓名
     * @return 实例对象
     */
    Student queryByName(@Param("name") String name );
    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return int
     */
    int insert(Student student);


}