package com.techlabs.basic1;

public class Boolean {
	int a;
	int b;
	public Boolean(int i, int j) {
		this.a=i;
		this.b=j;
	}
	
	public int comparison(){
		if(a>b)
			return a;
		else if(b>a)
			return b;
		return 0;
		
	}

}
