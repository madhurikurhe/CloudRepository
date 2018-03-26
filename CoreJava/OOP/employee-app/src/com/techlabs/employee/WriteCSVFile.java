package com.techlabs.employee;

	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	public class WriteCSVFile 
	{
		private static final String COMMA_DELIMITER = ",";
	    private static final String LINE_SEPARATOR = "\n";
	    
	    public static void main(String args[]) throws Exception
	    {
	    	Employee emp1 = new Employee(1,"FirstName1","LastName1",10000);
	    	Employee emp2 = new Employee(2,"FirstName2","LastName2",20000);
	    	Employee emp3 = new Employee(3,"FirstName3","LastName3",30000);
	    	Employee emp4 = new Employee(4,"FirstName4","LastName4",40000);
	    	Employee emp5 = new Employee(5,"FirstName5","LastName5",50000);
	    	
	    	List empList = new ArrayList();
	    	empList.add(emp1);
	    	empList.add(emp2);
	    	empList.add(emp3);
	    	empList.add(emp4);
	    	empList.add(emp5);
	    	
	    	FileWriter fileWriter = null;
	    
	    		fileWriter = new FileWriter("Employee.csv");
	    		
	    		Iterator it = empList.iterator();
	    		while(it.hasNext())
	    		{
	    			Employee e = (Employee)it.next();
	    			fileWriter.append(String.valueOf(e.getEmpId()));
	    			fileWriter.append(COMMA_DELIMITER);
	    			fileWriter.append(e.getFirstName());
	    			fileWriter.append(COMMA_DELIMITER);
	    			fileWriter.append(e.getLastName());
	    			fileWriter.append(COMMA_DELIMITER);
	    			fileWriter.append(String.valueOf(e.getSalary()));
	    			fileWriter.append(LINE_SEPARATOR);
	    		}
	    		System.out.println("Write to CSV file Succeeded!!!");
	    			fileWriter.close();
	    }
	}

