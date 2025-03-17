package com.skn;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.skn.entities.Contact_details;
import com.skn.repository.ContactRepo;

@SpringBootApplication
public class MyFirstGitProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(MyFirstGitProjApplication.class, args);
		ContactRepo cr=ctx.getBean(ContactRepo.class);
		Contact_details cd= new Contact_details();
		cd.setId("CD101");
		cd.setName("sunita");
		cd.setCno( 8144801200L);
		cd.setAddr("BAM");
		//setting of Date
		LocalDate dob=LocalDate.of(1980, 01, 22);
	    cd.setDob(dob);
	    cd.setRelation("Mother");
	   cr.save(cd);
	    System.err.println("Record Inserted......");
	}

}
