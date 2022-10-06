package com.service;

import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import com.model.Contact;



@Service
public class ContactService {
	
	private static org.slf4j.Logger log=LoggerFactory.getLogger(ContactService.class);
	
	
	
	public boolean saveMessageDetails(Contact contact) {
		boolean isSaved=true;
		log.info(contact.toString());
		return isSaved;
		
	}

}
