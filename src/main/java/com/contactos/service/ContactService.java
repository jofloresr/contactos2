package com.contactos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactos.dao.ContactRepository;
import com.contactos.dto.Contact;

@Service("servicio")
public class ContactService {
	
	@Autowired
    ContactRepository dao;
     
   
    public Contact save(Contact contact){
        return dao.saveAndFlush(contact);
    }

}
