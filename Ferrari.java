package net.car.tralamy;

public class Ferrari extends Car {

	public Ferrari() {
		super("Ferrari");
		// TODO Auto-generated constructor stub
	}
	public Ferrari(int c) {
		super("Ferrari", c);
		
		// TODO Auto-generated constructor stub
	}
	public Ferrari(int c, String name) {
		super(name, c);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double carSpeed() {
		// TODO Auto-generated method stub
		return 900;
	}

	@Override
	public double carSize() {
		// TODO Auto-generated method stub
		return 1.5;
	}

	@Override
	public int carColor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double carEP() {
		// TODO Auto-generated method stub
		return 1010;
	}
	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 1;
	}

}
