import theRightWay_Encapsulation.EnhancedPlayer; //i mistankenly made another package o show the right way for
//encapsulation so i had to import theRighWay_Encapsulation.EnhancedPlayer

public class Main {

	public static void main(String[] args) {
		
//		Player player = new Player();
//		
//		player.name = "tim";
//		player.health = 20;
//		player.weapon = "Sword";
//		
//		int damage = 10;
//		player.lostHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//		
//		damage = 11;
//		
//		player.lostHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
		
		EnhancedPlayer ePlayer = new EnhancedPlayer("Joe", 50, "Sword");
		
		System.out.println(ePlayer.getHealth());
		System.out.println(ePlayer);
		ePlayer.lostHealth(45);
		System.out.println(ePlayer.getHealth());
		ePlayer.lostHealth(80);
		System.out.println(ePlayer.getHealth());
	}

}
