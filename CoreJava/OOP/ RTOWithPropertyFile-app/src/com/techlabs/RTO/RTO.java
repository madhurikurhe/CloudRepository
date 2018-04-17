package com.techlabs.RTO;

public class RTO implements Comparable<RTO> {

	private String state;
	private int code;
	
	public RTO(String state, int code) {
		super();
		this.state = state;
		this.code = code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public int compareTo(RTO o) {
		return code - o.code;
	}
	
	
}
