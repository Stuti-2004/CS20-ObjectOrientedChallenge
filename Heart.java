package codes;

public class Heart extends Organ{

	
	private int heartRate;
	
	public Heart(String name, String condition, int heartRate) {
		super(name, condition);
		this.heartRate = 80;
	}
	
	
	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Heart Rate = " +this.heartRate);
	}
	

	public int getHeartRate() {
		return heartRate;
	}


	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}
	
	

}