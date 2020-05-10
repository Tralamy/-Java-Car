package net.car.tralamy;

public abstract class Car {
	
	private double EP = (this.carEP() *  this.carSize() / 2  );
	private double speed = ( this.carSpeed() / this.carSize() );
	private String typeChoice[] = {"Electric", "Oil", "Air"};
	private String colorChoice[] = {"Blue", "Red", "White", "Black"};
	private String color = colorChoice[this.carColor()];
	private String type = typeChoice[this.type()]; 
	private String name;
	
	/*Constructor*/
	public Car(String name) {
		this.name = name ;
		this.type = typeChoice[0]  ;
		this.color = colorChoice[0] ;
	}
	public Car(String name, int c) {
		this.name = name ;
		this.setColor(c);
		this.type = typeChoice[0]  ;
		this.color = colorChoice[0] ;
	}
	public Car() {
		this.name = typeChoice[0] ;
		this.type = typeChoice[0]  ;
		this.color = colorChoice[0] ;
	}
	
	/*Name*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*Type*/
	public abstract int type();
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	/*Speed*/
	
	public abstract double carSpeed();
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	/*Size*/
	public abstract double carSize();
	
	/*Color*/
	
	public abstract int carColor();
	public String getColor() {
		return color;
	}

	public void setColor(int i) {
		this.color = colorChoice[i];
	}
	
	/*Durability*/
	public abstract double carEP();
	public double getEP() {
		return EP;
	}

	public void setE(double E) {
		this.EP = E;
	}
	
	/*Fonction*/
	
	public void describe() {
		System.out.println("["+this.name + "]:");
		System.out.println("Speed: "+ this.getSpeed());
		System.out.println("Size: " + this.carSize());
		System.out.println("EP: " + this.getEP());
		System.out.println("Color: " + this.getColor());
		System.out.println("Type: " + this.getType());
	}
	
	
	
	
	
	
	
}
