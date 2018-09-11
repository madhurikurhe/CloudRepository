package com.techlabs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.dbconnection.ConnectionProvider;
import com.techlabs.model.Student;

public class StudentDao {

    private Connection conn;

    public StudentDao() {
    	conn = ConnectionProvider.getConnection();
    }

    public void addStudent(Student user) {
        try {
        
            PreparedStatement ps = conn.prepareStatement("INSERT INTO stu1(userid, firstname,lastname,collegeID)" +
            		" VALUES (?, ?, ?,? )");
            
            ps.setInt(1, user.getId());
            ps.setString(2, user.getfName());
            ps.setString(3, user.getlName());
            ps.setInt(4, user.getCollegeID());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeStudent(int userId) {
        try {
            PreparedStatement ps = conn
                    .prepareStatement( "DELETE FROM stu1 WHERE userid=?");
            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      }

    public void editStudent(Student user) {    	
    	try {
            PreparedStatement ps = conn
                    .prepareStatement("UPDATE stu1 SET firstname=?, lastname=? ,collegeID=?" +
                            " WHERE userid=?");
            ps.setString(1, user.getfName());
            ps.setString(2, user.getlName());            
            ps.setInt(3, user.getId());
            ps.setInt(4, user.getCollegeID());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List getAllStudents() {
        List users = new ArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM stu1");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student user = new Student();
                user.setId(rs.getInt("userid"));
                user.setfName(rs.getString("firstname"));
                user.setlName(rs.getString("lastname"));                    
                user.setCollegeID(rs.getInt("collegeID"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public Student getUserById(int userId) {
    	Student user = new Student();
        try {
            PreparedStatement ps = conn.
                    prepareStatement("SELECT * FROM stu1 WHERE userid=?");
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	user.setId(rs.getInt("userid"));
            	user.setfName(rs.getString("firstname"));
            	user.setlName(rs.getString("lastname"));                           
            	user.setCollegeID(rs.getInt("collegeID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}