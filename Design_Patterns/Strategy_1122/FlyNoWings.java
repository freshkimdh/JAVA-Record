package Strategy_1122;

public class FlyNoWings implements FlyBehavior_inter {
    
	@Override
	public void fly() {
		System.out.println("저는 못 날아요!");
	}
      
}
