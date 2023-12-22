package wheeledTransportPackage;

import transportationPackage.Transportation;

public class WheeledTransportation extends Transportation{

	 protected int numOfWheels;
	 protected double maxSpeed;
	 private long wheelTransSerrialNum ;
	 private static long serialNumCounter = 1000;
	 
	 //Constructors
	 public WheeledTransportation () {
		 this.numOfWheels = 1;
		 this.maxSpeed = 1000;
		 wheelTransSerrialNum = getNextSerialNumber();
	 }
	 
	 public WheeledTransportation (int numOfWheels, double maxSpeed) {
		 this.numOfWheels = numOfWheels;
		 this.maxSpeed = maxSpeed;
		 wheelTransSerrialNum = getNextSerialNumber();
	 }
	 
	public WheeledTransportation (WheeledTransportation wt) {
		 this.numOfWheels = wt.numOfWheels;
		 this.maxSpeed = wt.maxSpeed;
		 wheelTransSerrialNum = getNextSerialNumber();
		
	}

	//Getters and Setters
	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public long getWheelTransSerrialNum() {
		return wheelTransSerrialNum;
	}

	
	public static long getNextSerialNumber() { 
		 return serialNumCounter ++; 
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		
		WheeledTransportation x = (WheeledTransportation) obj;
		
		return Double.doubleToLongBits(maxSpeed) == Double.doubleToLongBits(x.maxSpeed)
				&& numOfWheels == x.numOfWheels;
	}

	@Override
	public String toString() {
		return "This wheeled Transportation - serial # "+ wheelTransSerrialNum 
							+ ", has Wheels=" + numOfWheels + ", with maxSpeed=" + maxSpeed;
		
	
	}

	@Override
	public boolean smallerBy(Object x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WheeledTransportation clone() {
		return new WheeledTransportation(this);
	}
	 
}
