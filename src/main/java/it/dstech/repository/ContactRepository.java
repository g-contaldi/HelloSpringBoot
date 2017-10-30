package it.dstech.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.dstech.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

	List<Contact> findByUser_Id(int userId);

	Contact findByTel(String tel);

}
