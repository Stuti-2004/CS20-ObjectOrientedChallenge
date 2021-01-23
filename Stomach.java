package codes;

public class Stomach extends Organ{
	
	private boolean isEmpty;

	public Stomach(String name, String condition, boolean isEmpty) {
		super(name, condition);
		this.isEmpty = true;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void getDetails() {
		super.getDetails();
		if (this.isEmpty)
			System.out.println("Stomach is empty");
		else 
			System.out.println("Stomach is full");
	}

	
	public void digest() {
		System.out.println("Stomach is digesting. . .");
	}
	

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	

}