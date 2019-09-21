package facefolkspack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Hotelmanagement 
{
	 public static void main (String args[]) throws IOException {
	 {
	  String name;
	  String address;
	  String contact;
	  String email;
	  String prooftype;
	  String proofId;
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  name = br.readLine();
 	  address = br.readLine();
 	  contact = br.readLine();
 	  email = br.readLine();
 	  prooftype = br.readLine();
 	  proofId = br.readLine();
 	  
	  Customers obj1=new Customers();
	  
	  obj1.setName(name);
	  obj1.setAddress(address);
	  obj1.setContact(contact);
	  obj1.setEmail(email);
	  obj1.setProoftype(prooftype);
	  obj1.setProofId(proofId);
	  
	  obj1.method1();
	  
	 }
}
}
	  