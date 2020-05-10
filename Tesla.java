package net.car.tralamy;

public class Tesla extends Car {

	public Tesla() {
		super("Tesla");
		// TODO Auto-generated constructor stub
	}
	public Tesla(int c) {
		super("Tesla", c);
		
		// TODO Auto-generated constructor stub
	}
	public Tesla(int c, String name) {
		super(name, c);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double carSpeed() {
		// TODO Auto-generated method stub
		return 400;
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
		return 1900;
	}
	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 0;
	}

}
