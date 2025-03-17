package com.skn.springjdbc.prog1springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.skn.entities.StudDao;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        ApplicationContext ctx= new ClassPathXmlApplicationContext("com/skn/springjdbc/prog1springjdbc/config.xml");
 //       JdbcTemplate temp=ctx.getBean("jdbcTemplate",JdbcTemplate.class);
//        //insert query
//        String query="insert into stud values(?,?,?,?)";
//        
//        //fire query
//        int k = temp.update(query, "M036","sagar","bbsr","ME");
//        if(k>0) System.out.println("1 row inserted....");
        
        //company design pattern for insert query
        
       StudDao stuDao=  ctx.getBean("studentDao",StudDao.class);
//        Student stu = ctx.getBean("stu",Student.class);
//        int result=stuDao.insert(stu);
//        if(result>0) System.out.println("1 row inserted....");
        
//        //update 
//        result=0;
//        System.out.println("enter the sno:");
//         stu.setSno(sc.nextLine());
//         System.out.println("enter the City currently you Staying:");
//         stu.setScity(sc.nextLine());
//          result=stuDao.update(stu);
//         if(result>0) System.out.println("1 row updated....");
       
//         //delete
//         result=0;
//         System.out.println("enter the sno:");
//         result=stuDao.delete(sc.nextLine());
//         if(result>0) System.out.println("1 row deleted....");
       
//         //see the table
//         System.out.println("enter the sno:");
//         Student stud=stuDao.getStuDetails(sc.nextLine());
//         System.out.println(stud);
       
         //see all the record in table
         List<Student> stult=stuDao.getAllStuDetails();
         for(Student s :stult) System.out.println(s);

    }
    
}
  