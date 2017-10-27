package it.dstech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.dstech.model.Contact;
import it.dstech.services.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/getModel")
	public Contact getContactModel() {
		return new Contact();
	}

	@PostMapping("/saveOrUpdate")
	public Contact saveOrUpdateContact(@RequestBody Contact contact) {
		logger.info("Contact saved or updated.");
		return contactService.saveOrUpdateContact(contact);
	}

	@GetMapping("/getById/{id}")
	public Contact getContactById(@PathVariable("id") int id) {
		logger.info("Contact found.");
		return contactService.findOne(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteContact(@PathVariable("id") int id) {
		contactService.deleteContact(id);
		logger.info("Contact deleted.");
	}

	@GetMapping("/findByTel/{tel}")
	public Contact findByTel(@PathVariable("tel") String tel) {
		logger.info("Contact found.");
		return contactService.findByTel(tel);
	}

}
