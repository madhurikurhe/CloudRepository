package com.techlabs.ricks.guitar;

public enum Builder {
	FENDER,MARTIN,GIBSON,COLLINGS,OLSON,RYAN,PRS,ANY;
	public String toString(){
		switch(this){
		case FENDER:return "Fender";
		case MARTIN:return "Fender";
		case GIBSON:return "Fender";
		case COLLINGS:return "Fender";
		case OLSON:return "Olson";
		case RYAN:return "Ryan";
		case PRS:return "Prs";
		case ANY:return "Any";
		
		}
		return null;
	}
}
