
public class VirtualPet {

	private int hunger = 50;
	private int thirst = 50;
	private int boredom = 50;
	private int waste = 25;

	public void tick() {
		hunger = hunger + 1;
		thirst = thirst + 1;
		boredom = boredom + 1;
		waste = waste + 1;
	}

	public int getHunger() {
		return hunger;
	}

	public void feed() {
		hunger = hunger - 5;
	}

	public boolean isHungry() {
		boolean hungry = (hunger >= 25);
		return hungry;
	}

	public int getThirst() {
		return thirst;
	}

	public void drinkwine() {
		thirst = thirst - 10;
		boredom = boredom - 10;

	}

	public void drinkWater() {
		thirst = thirst + 5;
	}

	public boolean isThirsty() {
		boolean thirsty = (thirst >= 25);
		return thirsty;

	}

	public void play() {
		boredom = boredom - 5;
	}

	public int getBoredom() {
		return boredom;
	}

	public boolean isBored() {
		boolean bored = (boredom >= 25);
		return bored;
	}

	public int getWaste() {
		return waste;

	}

	public void takeWalk() {
		waste = waste - 10;
		boredom = boredom - 3;
	}

	public boolean hasToPoo() {
		boolean pooPoo = (waste >= 25);
		return pooPoo;
	}

	public boolean isUnhappyGuy() {
		boolean needAttention = (isBored() || hasToPoo() || isThirsty() || isHungry());
		return needAttention;
	}

}
