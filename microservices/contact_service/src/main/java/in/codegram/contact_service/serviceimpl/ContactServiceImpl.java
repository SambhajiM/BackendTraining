package in.codegram.contact_service.serviceimpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import in.codegram.contact_service.domain.Contact;
import in.codegram.contact_service.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	//Fake list of contacts
	List<Contact> contacts = Arrays.asList(
			new Contact(1L, "vikash@gmail.com","Vikash", 1311L),
			new Contact(2L, "aman@gmail.com","Aman", 1311L),
			new Contact(3L, "shalini@gmail.com","Shalini", 1312L),
			new Contact(4L, "suhas@gmail.com","Suhas", 1312L),
			new Contact(5L, "abhishek@gmail.com","Abhishek", 1314L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return contacts.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
