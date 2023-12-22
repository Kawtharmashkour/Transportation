package monoWheelsPackage;

import wheeledTransportPackage.WheeledTransportation;

public class Monowheels extends WheeledTransportation{
	
	 private double maxWeight; 
	 private long monoWheelsSerrialNum;
	 private static long serialNumCounter = 55000;
	 
	//Constructors
	 public Monowheels() {
		 	super();
			this.maxWeight = 5.6;
			monoWheelsSerrialNum = getNextSerialNumber();
		}
	 
	 public Monowheels(double maxWeight, double maxSpeed) {
		super(1, maxSpeed);
		this.maxWeight = maxWeight;
		monoWheelsSerrialNum = getNextSerialNumber();
	}
	 
	 public Monowheels (Monowheels mw) {
		 super(mw);
		 this.maxWeight = mw.maxWeight;
		 this.monoWheelsSerrialNum = getNextSerialNumber();
	 
	 }

	/**
	 * @return the maxWeight
	 */
	public double getMaxWeight() {
		return maxWeight;
	}

	/**
	 * @param maxWeight the maxWeight to set
	 */
	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	/**
	 * @return the monoWheelsSerrialNum
	 */
	public long getMonoWheelsSerrialNum() {
		return monoWheelsSerrialNum;
	}

	public static long getNextSerialNumber() {
		
		return serialNumCounter ++;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
			
		Monowheels x = (Monowheels) obj;
		
		return super.equals(obj) && Double.doubleToLongBits(maxWeight) == Double.doubleToLongBits(x.maxWeight);
	}
	

	@Override
	public String toString() {

		return "This monowheels - serial # "+monoWheelsSerrialNum
				+" of wheel transportation - serial # "+ getWheelTransSerrialNum()
				+", \nhas Wheels=" + numOfWheels + ", with maxSpeed=" + maxSpeed
				+" and maxWeight=" + maxWeight;
	}
	
}
