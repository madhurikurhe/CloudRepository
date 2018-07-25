package com.techlabs.contact;


	import java.io.Serializable;

	public class Contact implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String fname,lname,email;
		
		Contact(String fname, String lname, String email)
		{
			this.fname=fname;
			this.lname=lname;
			this.email=email;
		}
		
		public Contact() {
			// TODO Auto-generated constructor stub
		}

		
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getfname()
		{
			return fname;
		}

		public String getlname()
		{
			return lname;
		}
		public String getemail()
		{
			return email;
		}
	}


