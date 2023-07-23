package com.southwind.repository;

import java.util.Collection;

import com.southwind.entity.Student;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student s);
    public void deleteById(long id);
}
