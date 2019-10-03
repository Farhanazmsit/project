package ContactManager;
/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class
public class Contact{
	String name;
	String email;
	String phonenumber;

	public String toString() {
	return "{"+"Name="+name+
			", Email="+email+
			", Phone Number="+phonenumber+"}";
	}
	public Contact(String name,String email,String phonenumber) {
		this.name=name;
		this.email=email;
		this.phonenumber=phonenumber;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPhoneNumber(String phonenumber) {
		this.phonenumber=phonenumber;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phonenumber;
	}
}
	

	



