package waterCraftPackage;

import transportationPackage.Transportation;

public class Ferry extends Transportation{
	 protected double maxSpeed; 
	 protected double maxLoad; 
	 private long ferrySerrialNum; 
	 private static long serialNumCounter = 70000;

	 //Constructors
	 public Ferry() {
			this.maxSpeed = 55;
			this.maxLoad = 100;
			this.ferrySerrialNum = getNextSerialNumber();
		}
 
	 public Ferry(double maxSpeed, double maxLoad) {
		this.maxSpeed = maxSpeed;
		this.maxLoad = maxLoad;
		this.ferrySerrialNum = getNextSerialNumber();
	}
	 
	public Ferry (Ferry f) {
		 this.maxSpeed = f.maxSpeed;
		 this.maxLoad = f.maxLoad;
		 ferrySerrialNum = getNextSerialNumber();
	 
	}
	  
	//Getters and Setters
	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}

	public long getFerrySerrialNum() {
		return ferrySerrialNum;
	}


	public static long getNextSerialNumber() {
			
			return serialNumCounter++;
	}
	 
	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
			
		Ferry x = (Ferry) obj;
		
		return Double.doubleToLongBits(maxSpeed) == Double.doubleToLongBits(x.maxSpeed)
				&& Double.doubleToLongBits(maxLoad) == Double.doubleToLongBits(x.maxLoad);
	}

	@Override
	public String toString() {
		return "This ferry - serial # "+ferrySerrialNum+", with maxSpeed=" + maxSpeed + ", and maxLoad=" + maxLoad;
		
	}

	@Override
	public boolean smallerBy(Object x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Ferry clone() {
		return new Ferry(this);
	}

	


	
}

	