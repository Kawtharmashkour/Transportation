package airCraftPackage;

import transportationPackage.Transportation;

public class AirCraft extends Transportation implements Comparable<AirCraft>{

	 protected double price;
	 protected double maxElevation;
	 private long airCraftSerrialNum;
	 private static long serialNumCounter = 65000;
	 
	 //Constructors
	 public AirCraft() {
		 //super();
		 price = 230.5;
		 maxElevation = 4.6;
		 airCraftSerrialNum = getNextSerialNumber();
	 }
	 
	 public AirCraft(double price, double maxElevation) {
		//super(, , ); 
		this.price = price;
		this.maxElevation = maxElevation;
		this.airCraftSerrialNum = getNextSerialNumber();
	}
	 
	 public AirCraft (AirCraft ac) {
		 //super();
		 this.price = ac.price;
		 this.airCraftSerrialNum = getNextSerialNumber();

	}
	 
	 //Getter and Setter
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMaxElevation() {
		return maxElevation;
	}

	public void setMaxElevation(double maxElevation) {
		this.maxElevation = maxElevation;
	}

	public long getAirCraftSerrialNum() {
		return airCraftSerrialNum;
	}

	public static long getNextSerialNumber() {
		 
		 return serialNumCounter ++; 
		
	 }
	 
	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
			
		AirCraft x = (AirCraft) obj;
		
		return  Double.doubleToLongBits(price) == Double.doubleToLongBits(x.price)
				&& Double.doubleToLongBits(maxElevation) == Double.doubleToLongBits(x.maxElevation);
	}
	
	
	@Override
	public String toString() {
		return "This AirCraft - serial # "+airCraftSerrialNum 
					+"\nwith price=" + price + ", and maxElevation=" + maxElevation ;
	}

	@Override
	public boolean smallerBy(Object x) {
		if(x==null || x.getClass() != this.getClass()) {
			return false;
		}
		 
		AirCraft ac  = (AirCraft) x;
		if(this.price < ac.price) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public AirCraft clone() {
		return new AirCraft(this);
	}
 
	//solution2 to sort array of AirCraft
	@Override
	public int compareTo(AirCraft o) {
		return Double.compare(this.price, o.price);
	}
	
	
}
