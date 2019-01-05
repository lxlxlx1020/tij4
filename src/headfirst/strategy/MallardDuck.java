package headfirst.strategy;

public class MallardDuck extends Duck {
 
	public MallardDuck() {
 
		quackBehavior = new Quack();
                flyBehavior = new FlyWithWings();
 

	}

	/**
	 * 新增一个构造函数，传入两种行为，动态绑定鸭子和行为
	 * @param quackBehavior
	 * @param flyBehavior
	 */
	public MallardDuck(QuackBehavior quackBehavior,FlyBehavior flyBehavior) {

		this.quackBehavior = quackBehavior;
		this.flyBehavior = flyBehavior;


	}
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck(new MuteQuack(),new FlyNoWay());
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}
}
