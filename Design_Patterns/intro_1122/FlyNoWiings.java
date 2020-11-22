package intro_1122;

public class FlyNoWiings implements FlyBehavior_inter {
    
	@Override
	public void fly() {
		System.out.println("저는 못 날아요!");
	}
      
}
