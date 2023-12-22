package metroPackage;

import railTransportPackage.Train;

public class Metro extends Train{
	 protected int numOfStops;
	 private long metroSerialNum;
	 private static long serialNumCounter = 25000;
	 
	 //Constructors
	 public Metro() {
			super();
			this.numOfVehicles = 4;
			this.numOfStops = 3;
			this.metroSerialNum = getNextSerialNumber();
		}
	 
	
	 
	 public Metro(int numOfStops, int numOfVehicles, String startStationName, String destinationStationName, int numOfWheels, double maxSpeed ) {
		super(numOfVehicles, startStationName, destinationStationName, numOfWheels, maxSpeed);
		this.numOfStops = numOfStops;
		this.metroSerialNum = getNextSerialNumber();
	}



	public Metro (Metro m) {
		 super(m);
		 this.numOfStops = m.numOfStops;
		 this.metroSerialNum = getNextSerialNumber();

	}


	//Getter and Setter
	public int getNumOfStops() {
		return numOfStops;
	}

	public void setNumOfStops(int numOfStops) {
		this.numOfStops = numOfStops;
	}

	public long getMetroSerialNum() {
		return metroSerialNum;
	}

	
	public static long getNextSerialNumber() {
		 
		 return serialNumCounter ++; 
		
	 }

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
			
		Metro x = (Metro) obj;
		
		return super.equals(obj) && numOfStops == x.numOfStops;
	}


	@Override
	public String toString() {
		return "This metro – serial # "+metroSerialNum+" of Train – serial # "
				+ getTrainSerialNum()+" of wheel Transportation - serial # "
				+ getWheelTransSerrialNum()
				+" - \nhas "+ numOfWheels+" wheels, has a maximum speed of "
				+ maxSpeed+"km/hr. It has "+ numOfVehicles 
				+ " vehicles and its starting and destination stations are " + startStationName
				+ " and " + destinationStationName
				+", with numOfStops=" + numOfStops;
	}
	
	
}
