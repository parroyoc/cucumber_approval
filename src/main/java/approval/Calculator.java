package approval;

public class Calculator {

	private int currentValue;

	public Calculator() {
		System.out.println("Creating the calculator");
	}
	
	public void reset() {
		System.out.println("Reseting the calculator");
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setTo(int value) {
		this.currentValue = value;
	}

	public void add(int units) {
		this.currentValue += units;
	}

}
