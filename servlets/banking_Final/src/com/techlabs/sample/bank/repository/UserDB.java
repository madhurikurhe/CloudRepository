package com.techlabs.sample.bank.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.sample.bank.model.Account;
import com.techlabs.sample.bank.model.Transaction;

public class UserDB {
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	private MakeConnection makeConn = new MakeConnection();

	public boolean checkUser(String name, String password) {
		Connection conn = makeConn.connect();
		String checkUserQuery = "SELECT * FROM BANK_MASTER WHERE NAME=? AND PASS=?;";
		try {
			stmt = conn.prepareStatement(checkUserQuery);
			stmt.setString(1, name);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			if (rs.next()) {
				return true;
			}

		} catch (SQLException ex) {
			System.out.println("Exception:" + ex.getMessage());
		}
		return false;
	}

	public void addUser(Account acc) {
		Connection conn = makeConn.connect();
		String addUserQuery = "INSERT INTO BANK_MASTER VALUES" + "(?,?,?)";
		String txnQuery = "INSERT INTO BANK_TRANSACTION VALUES"
				+ "(?,?,'D',NOW())";
		try {
			conn.setAutoCommit(false);

			stmt = conn.prepareStatement(addUserQuery);
			stmt.setString(1, acc.getName());
			stmt.setString(2, acc.getPassword());
			stmt.setDouble(3, acc.getBalance());
			stmt.execute();

			stmt = conn.prepareStatement(txnQuery);
			stmt.setString(1, acc.getName());
			stmt.setDouble(2, acc.getBalance());
			stmt.execute();

			conn.commit();

		} catch (SQLException ex) {
			try {
				conn.rollback();
			} catch (SQLException cx) {
				System.out.println("Exception:" + cx.getMessage());
			}
			System.out.println("Exception:" + ex.getMessage());
		}
	}

	public List<Account> getAllCustomers() {
		List<Account> account;
		Connection conn = makeConn.connect();
		String txnQuery = "SELECT * FROM BANK_MASTER";
		account = new ArrayList<Account>();
		try {
			stmt = conn.prepareStatement(txnQuery);
			rs = stmt.executeQuery();
			account = new ArrayList<Account>();
			while (rs.next()) {
				account.add(new Account(rs.getString("name"), rs
						.getString("password"), rs.getDouble("balance")));
			}
			conn.close();

		} catch (SQLException ex) {
			System.out.println("Exception:" + ex.getMessage());
		}
		return account;

	}
}
