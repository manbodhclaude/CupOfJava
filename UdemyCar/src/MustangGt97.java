
public class MustangGt97 extends Car{ //automatic version of mustang Gt 97
	
	private int roadServiceMonths;

	public MustangGt97(int roadServiceMonths) {
		super("97MustangGT", "Coupe", 5, 2, 4, false);
		this.roadServiceMonths = roadServiceMonths;
	}
	
	public void accelerate(int rate) {
		
		int newVelocity = getCurrentVelocity() + rate;
		if(newVelocity == 0) {
			stop();
			changeGear(1);
		}else if(newVelocity > 0 && newVelocity <= 10) {
			changeGear(1);
		}else if(newVelocity > 10 && newVelocity <= 20) {
			changeGear(2);
		}else if(newVelocity > 20 && newVelocity <= 30) {
			changeGear(3);
		}else {
			changeGear(4);
		}
		
		if(newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
		
	}

}
