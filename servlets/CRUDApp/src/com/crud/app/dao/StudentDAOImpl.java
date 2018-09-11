package com.crud.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crud.app.model.Student;
import com.crud.app.util.DBUtil;

public class StudentDAOImpl implements StudentDAO{

 Connection connection=null;
 
 public StudentDAOImpl(){
 
 connection = DBUtil.getConnection();
 
 System.out.println("connectionnnection");
 }
 
 @Override
 public void addStudent(Student employee) {
 // TODO Auto-generated method stub
 
 try{
 
 String sql="INSERT INTO Employee(name,email,age,joindate,salary,address) values ( ?, ?, ?, ?, ?, ? )";
 
 PreparedStatement pst = connection.prepareStatement(sql);
 
 pst.setString(1, employee.getEmployeeName());
 pst.setString(2, employee.getEmail());
 pst.setInt(3, employee.getAge());
 pst.setDate(4, new java.sql.Date(employee.getJoinDate().getTime())); 
 pst.setDouble(5, employee.getSalary()); 
 pst.setString(6, employee.getAddress());
 
 int res = pst.executeUpdate();
 
 if(res > 0){
 System.out.println("Employeed");
 }
 
 
 }
 catch(SQLException e){
 e.printStackTrace();
 }
 }

 @Override
 public void updateStudent(Student employee) {
 // TODO Auto-generated method stub
 
 try{
 String sql="UPDATE Employee SET NAME = ?, Email = ?, AGE=?, JoinDate = ?, SALARY = ?, ADDRESS = ? WHERE id = ? ";
 
 PreparedStatement pst = connection.prepareStatement(sql);
 
 pst.setString(1, employee.getEmployeeName());
 pst.setString(2, employee.getEmail());
 pst.setInt(3, employee.getAge());
 pst.setDate(4, new java.sql.Date(employee.getJoinDate().getTime())); 
 pst.setDouble(5, employee.getSalary()); 
 pst.setString(6, employee.getAddress());
 
 pst.setLong(7, employee.getEmployeeId());
 
 int res = pst.executeUpdate();
 
 if(res > 0){
 System.out.println("Employeeted");
 }
 
 }
 catch(SQLException e){
 e.printStackTrace(); 
 }
 }

 @Override
 public void deleteStudent(Student employee) {
 // TODO Auto-generated method stub
 
 try{
 
 String sql="DELETE FROM Employee WHERE id = ? "; 
 PreparedStatement pst = connection.prepareStatement(sql);
 pst.setLong(1, employee.getEmployeeId());
 
 int res = pst.executeUpdate();
 
 if(res > 0){
 System.out.println("Employeeted");
 }
 
 }
 catch(SQLException e){
 e.printStackTrace();
 }
 }

 @Override
 public List<Student> getAllStudents() {
 // TODO Auto-generated method stub
 
 List<Student> employees = new ArrayList<Student>();
 
 try{
 
 String sql="SELECT * FROM Employee ";
 
 PreparedStatement pst = connection.prepareStatement(sql);
 
 ResultSet rs = pst.executeQuery();
 
 while(rs.next()){
 
 Student employee = new Student();
 
 employee.setEmployeeId(rs.getLong(1));
 employee.setStudentName(rs.getString(2));
 employee.setEmail(rs.getString(3));
 employee.setAge(rs.getInt(4));
 employee.setJoinDate(rs.getDate(5));
 employee.setSalary(rs.getDouble(6));
 employee.setAddress(rs.getString(7));
 
 employees.add(employee);
 
 }
 
 }
 catch(SQLException e){
 e.printStackTrace();
 }
 
 return employees;
 }

 @Override
 public Student getStudentById(long id) {
 // TODO Auto-generated method stub
 
 Student employee = null;
 
 try{
 
 String sql="SELECT * FROM Employee WHERE id = ? ";
 
 PreparedStatement pst = connection.prepareStatement(sql);
 pst.setLong(1, id); 
 ResultSet rs = pst.executeQuery();
 
 while(rs.next()){
 
 employee = new Student();
 
 employee.setEmployeeId(rs.getLong(1));
 employee.setStudentName(rs.getString(2));
 employee.setEmail(rs.getString(3));
 employee.setAge(rs.getInt(4));
 employee.setJoinDate(rs.getDate(5));
 employee.setSalary(rs.getDouble(6));
 employee.setAddress(rs.getString(7));
 
 }
 
 }
 catch(SQLException e){
 e.printStackTrace();
 }

 return employee;
 }

}