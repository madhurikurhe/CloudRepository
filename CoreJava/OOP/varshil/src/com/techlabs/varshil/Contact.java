package com.techlabs.varshil;
	
	import java.io.Serializable;
	public class Contact implements Serializable{
		
		private String fname;
		private String lname;
		private String email;
		
		public Contact(String fname, String lname, String email) {
			this.fname = fname;
			this.lname = lname;
			this.email=email;
		}
		public String getFirstName() {
			return fname;
		}

		public String getEmail() {
			return email;
		}

		public String getLastName() {
			return lname;
		}
		

	}

