package net.car.tralamy;


public class Main {

	public static void main(String[] args) {
		
		
		TCar TCar = new TCar();
		TCar.describe();
		
		System.out.println("");
		
		System.out.println("-o-o-o-o-");
		
		System.out.println("");
		
		Tesla Tesla = new Tesla();
		Tesla.describe();
		
		System.out.println("");
		
		System.out.println("-o-o-o-o-");
		
		System.out.println("");
		
		Ferrari Ferrari = new Ferrari();
		Ferrari.describe();
		
		System.out.println("");
		
		System.out.println("-o-o-o-o-");
		
		System.out.println("");
		
		LaserTank LaserTank = new LaserTank();
		LaserTank.describe();
		
		System.out.println("\nFight\n");
		
		LaserTank.attack(Tesla);
		


	}
	

}
