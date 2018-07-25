package com.techlabs.contact;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ContactShare {
	
	public void serialize(List<Contact> contactList) throws Exception
	{

		FileOutputStream student = new FileOutputStream("Contact.ser"); 
		ObjectOutputStream out=new ObjectOutputStream(student);
		
		out.writeObject(contactList); 
		
		out.close();
	}
	public List<Contact> deserialize()
	{
		
		  List<Contact> contactList=null;
	 try{
		  ObjectInputStream in =new ObjectInputStream(new FileInputStream("Contact.ser")); 
		  contactList=(List<Contact>) in.readObject();
		  in.close();
	 }catch(IOException e)
	 {
		 System.out.println(e);
	 }
	 catch(ClassNotFoundException e)
	 {
		 System.out.println(e);
	 }

		 return contactList;
	}

	
	
	public void export(List<Contact> contactList) throws Exception
	{
		FileWriter cont = new FileWriter("Contact.csv");
		
		for(int i=0; i<contactList.size(); i++)
		{
			cont.append(contactList.get(i).getfname());
			cont.append(",");

			cont.append(contactList.get(i).getlname());
			cont.append(",");

			cont.append(contactList.get(i).getemail());
			cont.append(",");
		}
		
		cont.close();
		
	}

}
