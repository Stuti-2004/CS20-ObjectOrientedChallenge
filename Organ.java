package codes;

public class Organ {

	private String name, condition;

	// declaring constructor for the organ object
	public Organ(String name, String condition) {
		super();
		this.name = name;
		this.condition = condition;
	}

	//Method to print details
	public void getDetails() {
		System.out.println("Organ: " + getName());
		
		if (this.condition != null)
			System.out.println("Condition: " +getCondition());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
	

}