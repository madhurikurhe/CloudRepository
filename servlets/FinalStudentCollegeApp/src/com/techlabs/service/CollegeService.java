package com.techlabs.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techlabs.model.College;
import com.techlabs.repository.CollegeRepository;

public class CollegeService {
	private List<College> colleges = null;
	CollegeRepository collegeRepo = null;
	
	public CollegeService() {
		colleges = new ArrayList<College>();
		collegeRepo = new CollegeRepository();
	}
	
	
	public List<College> getColleges() throws SQLException {
		colleges = this.collegeRepo.getColleges();
		return colleges;
	}
	
	public void createColleges() {
		colleges.add(new College("101", "AVCOE", "Sangamner"));
		colleges.add(new College("102", "SRES", "Kopargaon"));
		colleges.add(new College("103", "VJTI", "Matunga"));
	}
	
	public College getCollegeById(String id) throws SQLException {
		List<College> colleges = this.collegeRepo.getColleges();
		for(College college:colleges) {
			if(college.getCollege_id().equals(id)) {
				return college;
			}
		}
		return null;
	}
	
	public Map<String, String> getCollegeIdNames() throws SQLException{
		return this.collegeRepo.getCollegeIdNames();
	}
}
