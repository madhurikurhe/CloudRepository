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
        
            PreparedStatement ps = conn.prepareStatement("INSERT INTO users(userid, firstname,lastname)" +
            		" VALUES (?, ?, ? )");
            
            ps.setInt(1, user.getId());
            ps.setString(2, user.getfName());
            ps.setString(3, user.getlName());            
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeStudent(int userId) {
        try {
            PreparedStatement ps = conn
                    .prepareStatement( "DELETE FROM users WHERE userid=?");
            ps.setInt(1, userId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
      }

    public void editStudent(Student user) {    	
    	try {
            PreparedStatement ps = conn
                    .prepareStatement("UPDATE users SET firstname=?, lastname=?" +
                            " WHERE userid=?");
            ps.setString(1, user.getfName());
            ps.setString(2, user.getlName());            
            ps.setInt(3, user.getId());
            ps.executeUpdate();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List getAllStudents() {
        List users = new ArrayList();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student user = new Student();
                user.setId(rs.getInt("userid"));
                user.setfName(rs.getString("firstname"));
                user.setlName(rs.getString("lastname"));                             
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
                    prepareStatement("SELECT * FROM users WHERE userid=?");
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            	user.setId(rs.getInt("userid"));
            	user.setfName(rs.getString("firstname"));
            	user.setlName(rs.getString("lastname"));                           
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}