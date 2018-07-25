package com.techlabs.job;
import java.util.ArrayList;

import org.junit.Test;
public class JobCandidateSorterTest {       
    
  public static void main(String[] args) {
	     
    JobCandidate jobCandidate1 = new JobCandidate("Madhu", "Female", 26);         
    JobCandidate jobCandidate2 = new JobCandidate("Trisha", "Female", 12);         
    JobCandidate jobCandidate3 = new JobCandidate("Aditi", "Female", 27);         
    JobCandidate jobCandidate4 = new JobCandidate("Dhwani", "Male", 25);         
    ArrayList<JobCandidate> jobCandidateList = new ArrayList<>();         
    jobCandidateList.add(jobCandidate1);         
    jobCandidateList.add(jobCandidate2);         
    jobCandidateList.add(jobCandidate3);         
    jobCandidateList.add(jobCandidate4);         
    JobCandidateSorter jobCandidateSorter = new JobCandidateSorter(jobCandidateList);         
    ArrayList<JobCandidate> sortedJobCandidate = jobCandidateSorter.getSortedJobCandidateByAge();         
    System.out.println("Sorted JobCandidate by age");         
    for (JobCandidate jobCandidate : sortedJobCandidate) {             
      System.out.println(jobCandidate);         
    }       
  } 
}