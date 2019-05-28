package com.exerciseone.dao;

import com.exerciseone.entity.Student;

import org.springframework.data.repository.CrudRepository;

/**
 * Repositorio de la clase Student.
 * 
 * @see com.exerciseone.entity.Student
 * 
 * @author pmandara
 *
 */
public interface IStudentDao extends CrudRepository<Student, Integer> {

}
