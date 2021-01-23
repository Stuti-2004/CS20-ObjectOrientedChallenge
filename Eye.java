package codes;

import java.util.Scanner;

public class Eye extends Organ{

	private boolean isOpened;
	private String colour;
	
	public Eye(String name, String condition, boolean isOpened, String colour) {
		super(name, condition);
		this.colour = "blue";
		this.isOpened = true;
	}
	
	
	
	@Override
	public void getDetails () {
		super.getDetails();
		System.out.println("Eye colour: " + this.colour);
		
		if (this.isOpened)
			System.out.println("Eye is opened");
		else 
			System.out.println("Eye is closed");
	}
	
	
	
	
	public void open () {
		this.setOpened(true);
		System.out.println(getName() + " is opened");
		
	}

	public void close () {
		this.setOpened(false);
		System.out.println(getName() + " is closed");
		
	}
	
	
	
	

	public boolean isOpened() {
		return isOpened;
	}

	public void setOpened(boolean isOpened) {
		this.isOpened = isOpened;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	

}