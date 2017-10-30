package it.dstech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.model.Contact;
import it.dstech.repository.ContactRepository;

@Service
public class ContactServcieImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;

	@Override
	public Contact saveOrUpdateContact(Contact contact) {
		return contactRepo.save(contact);
	}

	@Override
	public Contact findOne(int id) {
		return contactRepo.findOne(id);
	}

	@Override
	public List<Contact> listContactByUser(int userId) {
		return (List<Contact>) contactRepo.findByUser_Id(userId);
	}

	@Override
	public void deleteContact(int id) {
		contactRepo.delete(id);
	}

	@Override
	public Contact findByTel(String tel) {
		return contactRepo.findByTel(tel);
	}

}
