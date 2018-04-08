package com.techlabs.dog.door;

public class Bark {
	
	String sound;

	public Bark(String sound) {
	this.sound=sound;}

	public String getSound() {
		return sound;

	}
	
	public boolean Equals(Bark bark)
    {
        if (sound.compareTo(bark.getSound()) == 0)
        {
            return true;
        }
        return false;
    }
	
}
