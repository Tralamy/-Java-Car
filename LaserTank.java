package net.car.tralamy;

public class LaserTank extends Car implements Attack{

	/*Constructors*/
	public LaserTank() {
		super("Laser Tank");
		// TODO Auto-generated constructor stub
	}
	
	public LaserTank(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public LaserTank(String name, int c) {
		super(name, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double carSpeed() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	public double carSize() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int carColor() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public double carEP() {
		// TODO Auto-generated method stub
		return 4000;
	}

	/*Interface Attack*/
	@Override
	public double damage() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public double ECost() {
		// TODO Auto-generated method stub
		return 600;
	}
	
	/*Attack*/
	
	public void attack(Car b) {
		this.setE(this.getEP() - this.ECost());
		System.out.println("["+this.getName()+"]"+this.getEP() + " EP");
		
		b.setE(b.getEP() - this.damage());
		System.out.println("["+b.getName()+"]"+b.getEP() + " EP");
		
	}
	
	

}
