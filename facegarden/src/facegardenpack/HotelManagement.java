package facegardenpack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class HotelManagement
{
	  String name;
 	  String address;
 	  String contact;
 	  String email;
 	  String prooftype;
 	  String proofId;
 	  static int registerID=0;
 	  public HotelManagement(String name,String address,String contact,String email,String prooftype,String proofId)
 	  {
 		this.name= name; 
 		this.address=address;
	    this.contact=contact;
	  	this.email=email;
	  	this.prooftype=prooftype;
	  	this.proofId=proofId;
 	  }
	public static void main(String[] args) throws IOException{
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
	  	  HotelManagement customer=new HotelManagement(name,address,contact,email,prooftype,proofId);
	  	  customer.register(name,address,contact,email,prooftype,proofId);
		}
	}
	public void register(String name,String address,String contact,String email,String prooftype,String proofId)
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(contact);
		System.out.println(email);
		System.out.println(prooftype);
		System.out.println(proofId);
		System.out.println("Thanks for registering. your ID is :"+ ++registerID);
	}
}