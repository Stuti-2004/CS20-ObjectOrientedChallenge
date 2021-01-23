package codes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Organ leftEye = new Eye ("left eye", "myopia", true, "brown");
		Organ rightEye = new Organ ("right eye", null);
		// will need method to open and close (attribute)
		
		Organ heart = new Heart ("Heart", null, 105); // will need HR attribute
		Organ stomach = new Stomach ("Stomach", null, true); // digestion method
		Organ skin = new Skin ("skin", "burnt", "brown", 8);
		*/
		
		Patient patient = new Patient("Tom", 35, 
								new Eye ("left eye", "myopia", true, "brown"),
								new Eye ("right eye", "myopia", true, "brown"),
								new Heart ("Heart", null, 105),
								new Stomach ("Stomach", null, true),
								new Skin ("skin", "burnt", "brown", 8));
		
		
		// Need a patient class
		System.out.println("\nPatient: " + patient.getName());
		System.out.println("Age: "+ patient.getAge());
		
		System.out.println("\nView Organs");
		System.out.println("1. Left Eye");
		System.out.println("2. Right Eye");
		System.out.println("3. Heart");
		System.out.println("4. Stomach");
		System.out.println("5. Skin");
		
		Scanner input = new Scanner(System.in);
		int playerChoice = input.nextInt();
		
		// inspect Left Eye
		if (playerChoice == 1) {
			patient.getLeftEye().getDetails();
				
			if (patient.getLeftEye().isOpened()) {
				System.out.println("\n1. Close eye?");
			
					if (input.nextInt() == 1)
						patient.getLeftEye().close();
			}
			
			// inspect right eye
		} else if (playerChoice == 2) {
				patient.getRightEye().getDetails();
				
			if (patient.getRightEye().isOpened()) {
				System.out.println("\n1. Close eye?");
			
					if (input.nextInt() == 1)
						patient.getRightEye().close();
			}
			
			
		// Inspect Heart
		} else if (playerChoice == 3) {
			patient.getHeart().getDetails();
			System.out.println("\n1. Change Heart Rate?");
			
			if (input.nextInt() == 1)
				System.out.print("New Heart Rate: ");
				patient.getHeart().setHeartRate(input.nextInt());
				
				System.out.println("Heart Rate set to " +patient.getHeart().getHeartRate());
	
			
		// Inspect Stomach
		} else if (playerChoice == 4) {
			patient.getStomach().getDetails();
			
			if (patient.getStomach().isEmpty())
				System.out.println("1. Digest Food?");
			
				if (input.nextInt() == 1)
					patient.getStomach().digest();
		}
		
		
		// Inspect Skin
		else if (playerChoice == 5) {
			patient.getSkin().getDetails();
			
			if (patient.getSkin().getSoft() <= 5)
				System.out.println("Moisturize skin?");
		}
		
		
		
	}

}