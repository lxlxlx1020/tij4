package headfirst.decorator.starbuzz;
 
public class Whip extends CondimentDecorator {
	Beverage beverage;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		double d;
		switch (size) {
			case tall: d=.10;break;
			case grande: d=.15;break;
			case venti: d=.20;break;
			default:d=0;
		}
		return d + beverage.cost();
	}
}
