package com.skn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skn.entities.Contact_details;

public interface ContactRepo extends JpaRepository<Contact_details,String>{

}
