package Strategy_1122;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWings();
	}
	
	@Override
	public void display() {
		System.out.println("저는 모형 오리입니다");
		
	}
}
