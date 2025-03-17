package com.skn.entities;

import java.util.List;

import com.skn.springjdbc.prog1springjdbc.Student;

public interface StudDao {
   public int insert(Student std);
   public int update(Student std);
   public int delete(String stno);
   public Student getStuDetails(String stno);
   public List<Student> getAllStuDetails();

}
