package com.skn.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.skn.springjdbc.prog1springjdbc.Student;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stud = new Student();
		stud.setSno(rs.getString(1));
		stud.setSname(rs.getString(2));
		stud.setScity(rs.getString(3));
		stud.setSbranch(rs.getString(4));
		return stud;
	}

}
