package ContactManager;
import ContactManager.ContactsManager;

public class Main {
	public static void main(String[] args) {
		Contact contact=new Contact("","","");
		ContactsManager myContactManager=new ContactsManager();
		myContactManager.addContact(new Contact("Kevin Wayne", "kevin@gmail.com", "9999912342"));
		myContactManager.addContact(new Contact("","",""));
		System.out.println(myContactManager.searchContactByEmail("kevin@gmail.com").toString());
        System.out.println(contact.toString());
	}
	
}
