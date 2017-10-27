package it.dstech.repository;

import org.springframework.data.repository.CrudRepository;

import it.dstech.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

	Contact findByTel(String tel);

}
