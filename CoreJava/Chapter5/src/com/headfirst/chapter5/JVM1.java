package com.headfirst.chapter5;

public class JVM1 {

	public static void main(String[] args) {

		JVM1 o = new JVM1();
		o.go();
	}

	void go() {
int y=7;
for (int x=1;x<8;x++){
	y++;
	if(x>4){
		System.out.print(++y + "");
	}
	if(y>14){
		System.out.print(" x =" + x);
		break;
	}

}
	
	
	}

}
