package com.demo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Contact;
import com.service.ContactService;

@Controller
public class ContactController {
	
	private static org.slf4j.Logger log=LoggerFactory.getLogger(ContactController.class);
	
	@Autowired(required = false)
	private  ContactService contactService;
	
	
	
	





	
	
	


	public ContactController() {
		
		// TODO Auto-generated constructor stub
	}


	@RequestMapping(value= {"/contact"})
	public String display3(Model model) {
		model.addAttribute("contact", new Contact());
		return "contact.html";
	}
	
	
	/* @PostMapping(value="/saveMsg")
	public ModelAndView saveMessage(@RequestParam String name,@RequestParam String mobileNum,@RequestParam String subject) {
		
		log.info("Name is:" +name);
		log.info("phone no is:" +mobileNum);
		log.info("Subject is:" +subject);
		
		return new ModelAndView("redirect:/");
	}*/
	
	@PostMapping(value="/saveMsg")
	public ModelAndView saveMessage(Contact contact) {
		contactService.saveMessageDetails(contact);
		
		return new ModelAndView("redirect:/");
		
	}

}
