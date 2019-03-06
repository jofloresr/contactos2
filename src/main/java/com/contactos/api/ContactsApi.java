package com.contactos.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contactos.dto.Contact;
import com.contactos.service.ContactService;



@RestController
public class ContactsApi {
	
	@Autowired
	@Qualifier("servicio")
	ContactService contactService;
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	 public Contact updateOrSave(@RequestBody Contact contact){
	    return contactService.save(contact);
	}
	
}
