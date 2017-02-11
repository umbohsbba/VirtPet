import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		VirtualPet bacchus = new VirtualPet();
		Scanner input = new Scanner(System.in);

		System.out.println("Hi, I am Bacchus the goatdragon! Thank you for taking care of me!!");
		do {
			System.out.println("What would you like to do today?? I will show you what I need!");

			if (bacchus.isHungry()) {
				System.out.println("I'm hungry, my hunger level is " + bacchus.getHunger());
			}
			if (bacchus.isThirsty()) {
				System.out.println("I'm thirsty, my thirst level is " + bacchus.getThirst());
			}
			if (bacchus.isBored()) {
				System.out.println("I'm bored, my boredom level is " + bacchus.getBoredom());
			}
			if (bacchus.hasToPoo()) {
				System.out.println(" I need to go out, my poo level is " + bacchus.getWaste());
			}

			System.out.println("Press 1 to feed me.");
			System.out.println("Press 2 to give me some wine. ");
			System.out.println("Press 3 to give me water(yuck!)");
			System.out.println("Press 4 to play ");
			System.out.println("Press 5 to take me for a walk!");

			int response = input.nextInt();
			switch (response) {
			case 1:
				bacchus.feed();
				bacchus.tick();
				break;
			case 2:
				bacchus.drinkwine();
				bacchus.tick();
				break;
			case 3:
				bacchus.drinkWater();
				bacchus.tick();
				break;
			case 4:
				bacchus.play();
				bacchus.tick();
				break;
			case 5:
				bacchus.takeWalk();
				bacchus.tick();
				break;
			}

			System.out.println("Thanks! Now My levels are: ");
			System.out.println("Hunger: " + bacchus.getHunger());
			System.out.println("Thirst: " + bacchus.getThirst());
			System.out.println("Boredom: " + bacchus.getBoredom());
			System.out.println("Need walk " + bacchus.getWaste());

		} while (bacchus.isUnhappyGuy());

		System.out.println("I have grown tired, please leave my chamber so I can rest!");
		System.out.println("Goodbye");
	}
}
