package com.techlabs.map;

public class Dog implements Comparable<Dog> {
	private String color;
	private int size;

	public Dog(String color) {
		this.color = color;
	}

	public Dog(String color,int size){
		this.color=color;
		this.size=size;
	}
	public String toString() {
		return color + " dog";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public int compareTo(Dog d) {
		return  size - d.size;
	}
	
	
}
