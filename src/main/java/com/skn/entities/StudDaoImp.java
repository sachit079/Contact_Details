package com.skn.entities;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.skn.springjdbc.prog1springjdbc.Student;

public class StudDaoImp implements StudDao {
	
	private JdbcTemplate jdbcTemplete;

	public JdbcTemplate getJdbcTemplete() {
		return jdbcTemplete;
	}

	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}

	@Override
	public int insert(Student std) {
		
		  //insert query
        String query="insert into stud values(?,?,?,?)";
      int k=  jdbcTemplete.update(query, std.getSno(),std.getSname(),std.getScity(),std.getSbranch());
		return k;
	}

	@Override
	public int update(Student std) {
		 //update query
        String query="update stud set scity= ? where sno=?";
        int k= jdbcTemplete.update(query, std.getScity(),std.getSno());
		return k;
	}

	@Override
	public int delete(String stno) {
		 //delete query
        String query="DELETE from stud where sno=?";
        int k= jdbcTemplete.update(query,stno);		
        return k;
	}

	@Override
	public Student getStuDetails(String stno) {
		//Select query
        String query="SELECT * from stud where sno=? ";
        RowMapper<Student>rowMapper= new RowMapperImpl();
       Student stu=jdbcTemplete.queryForObject(query, rowMapper, stno);
		return stu;
	}

	@Override
	public List<Student> getAllStuDetails() {
		//Select query
        String query="SELECT * from stud ";
       List<Student> stul= jdbcTemplete.query(query, new RowMapperImpl());
		return stul;
	}

}
