package com.techlabs.rectangle;

public class Rectangle 
{
	private int height;
	private int width;
	
	Rectangle()
	{
		height=0;
		width =0;
	}
	Rectangle(int h,int w)
	{
		height=h;
		width =w;
	}
	
	public int getH()
		{return height;}
	public int getW()
		{return width;}
	public int getA()
		{return height* width;}
	
	public void setH(int h)
		{height=h;}
	public void setW(int w)
		{width =w;}

	public String toString()
		{return "Rectangle: height="+height+"; width="+ width +
		"; area="+getA()+".";
		}

}
               
