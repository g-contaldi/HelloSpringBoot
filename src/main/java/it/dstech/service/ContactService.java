package it.dstech.service;

import java.util.List;

import it.dstech.model.Contact;

public interface ContactService {

	Contact saveOrUpdateContact(Contact contact);

	Contact findOne(int id);

	List<Contact> listContact();

	void deleteContact(int id);

	Contact findByTel(String tel);

}
