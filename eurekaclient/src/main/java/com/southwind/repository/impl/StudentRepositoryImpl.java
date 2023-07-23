package com.southwind.repository.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

    private static Map<Long,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 11));
        studentMap.put(2L, new Student(1L, "李四", 11));
        studentMap.put(3L, new Student(1L, "王五", 11));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student s) {
        studentMap.put(s.getId(), s);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }

}
