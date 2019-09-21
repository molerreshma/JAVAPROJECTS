package facefolkspack;

public class Customers 
{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	String contact;
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	String prooftype;
	public String getProoftype() {
		return prooftype;
	}
	public void setProoftype(String prooftype) {
		this.prooftype = prooftype;
	}
	String proofId;
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	
	public void method1()
	{
		System.out.println(getName());
		System.out.println(getAddress());
		System.out.println(getContact());
		System.out.println(getEmail());
		System.out.println(getProoftype());
		System.out.println(getProofId());
	}
	
}
