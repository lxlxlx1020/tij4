package headfirst.decorator.starbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";
  	protected Size size;
	public String getDescription() {
		return description;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public abstract double cost();

	public enum Size{
		tall,grande,venti;
	}
}
