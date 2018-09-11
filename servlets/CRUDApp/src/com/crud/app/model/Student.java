package com.crud.app.model;

import java.util.Date;

public class Student {
 
 private long employeeId;
 
 private String employeeName;
 
 private Date joinDate;
 
 private String email;
 
 private int age;
 
 private double salary;
 
 private String address;

 public Student(){}
 
 public Student(long employeeId,String employeeName,Date joinDate,String email,int age,double salary,String address){
 
 this.employeeId = employeeId;
 this.employeeName = employeeName; 
 this.joinDate = joinDate; 
 this.email = email; 
 this.age = age; 
 this.salary = salary; 
 this.address = address;
 
 }
 
 public long getEmployeeId() {
 return employeeId;
 }

 public void setEmployeeId(long employeeId) {
 this.employeeId = employeeId;
 }

 public String getEmployeeName() {
 return employeeName;
 }

 public void setStudentName(String employeeName) {
 this.employeeName = employeeName;
 }

 public Date getJoinDate() {
 return joinDate;
 }

 public void setJoinDate(Date joinDate) {
 this.joinDate = joinDate;
 }

 public String getEmail() {
 return email;
 }

 public void setEmail(String email) {
 this.email = email;
 }

 public int getAge() {
 return age;
 }

 public void setAge(int age) {
 this.age = age;
 }

 public double getSalary() {
 return salary;
 }

 public void setSalary(double salary) {
 this.salary = salary;
 }

 public String getAddress() {
 return address;
 }

 public void setAddress(String address) {
 this.address = address;
 }

}