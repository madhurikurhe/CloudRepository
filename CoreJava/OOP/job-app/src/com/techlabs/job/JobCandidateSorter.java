package com.techlabs.job;

import java.util.ArrayList; 
import java.util.Collections;   
public class JobCandidateSorter {     
  ArrayList<JobCandidate> jobCandidate = new ArrayList<>();       
  public JobCandidateSorter(ArrayList<JobCandidate> jobCandidate) {         
    this.jobCandidate = jobCandidate;     
  }       
  public ArrayList<JobCandidate> getSortedJobCandidateByAge() {         
    Collections.sort(jobCandidate);         
    return jobCandidate;     
  } 
}