package com.skn.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

	
	@Entity
	@Data
	public class Contact_details {
	@Id
	@Column(name="Cid")
	public String id;
	@Column(name="cname")
	private String name;
	@Column(name="Cnum")
	private Long cno;
	@Column(name="address")
	private String Addr;
	@Column(name="DOB")
	private LocalDate dob;
	@Column(name="Relation")
	private String relation;
	@CreationTimestamp
	@Column(name="date_created", updatable=false)
	private LocalDate dateCreated;
	@UpdateTimestamp
	@Column(name="last_updated", insertable=false)
	private LocalDate lastupdated;
	}

