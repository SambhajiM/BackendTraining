package in.codegram.contact_service.service;

import java.util.List;

import in.codegram.contact_service.domain.Contact;

public interface ContactService {
	
	public List<Contact> getContactsOfUser(Long userId);

}
