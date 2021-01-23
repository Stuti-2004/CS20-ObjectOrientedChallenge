package codes;

public class Skin extends Organ{

	
	private String colour;
	private int soft;
	
	public Skin(String name, String condition, String colour, int soft) {
		super(name, condition);
		this.colour = "tan";
		this.soft = 4;
	}

	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Skin Colour: " +this.colour);
		System.out.println("Hand moisture: " + this.soft);
	}
	
	
	
	
	
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSoft() {
		return soft;
	}

	public void setSoft(int soft) {
		this.soft = soft;
	}
	
	

	
	
}