package com.techlabs.ricks.guitar;

public enum Type {
	ACOUSTIC,ELECTRIC;
	public String toString(){
		switch(this){
		case ACOUSTIC:return "acoustic";
		case ELECTRIC:return "electric";
		default:
			break;
		
		}
		return null;
	}
}
