package net.car.tralamy;

public class TCar extends Car {
	
	
	
	public TCar() {
		super("TCar");
		// TODO Auto-generated constructor stub
	}
	public TCar(int c) {
		super("TCar", c);
		
		// TODO Auto-generated constructor stub
	}
	public TCar(int c, String name) {
		super(name, c);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double carEP() {
		// TODO Auto-generated method stub
		return 1200;
	}

	@Override
	public double carSpeed() {
		// TODO Auto-generated method stub
		return 600;
	}

	@Override
	public double carSize() {
		// TODO Auto-generated method stub
		return 1.5;
	}

	@Override
	public int carColor() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 2;
	}
	

}
