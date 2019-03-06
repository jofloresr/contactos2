package com.contactos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contactos.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
		 
	}

