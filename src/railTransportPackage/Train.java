package railTransportPackage;

import wheeledTransportPackage.WheeledTransportation;

public class Train extends WheeledTransportation{

	 protected int numOfVehicles;
	 protected String startStationName;
	 protected String destinationStationName;
	 private long trainSerialNum;
	 private static long serialNumCounter = 10000;
	
	 //Constructors
	 public Train() {
			super();
			this.numOfVehicles = 4;
			this.startStationName = "Montreal";
			this.destinationStationName = "Toronto";
			this.trainSerialNum = getNextSerialNumber();
		}
	 
	 public Train(int numOfVehicles, String startStationName, String destinationStationName, int numOfWheels, double maxSpeed) {
			super(numOfWheels, maxSpeed);
			this.numOfVehicles = numOfVehicles;
			this.startStationName = startStationName;
			this.destinationStationName = destinationStationName;
			this.trainSerialNum = getNextSerialNumber();
		}
	 
	 public Train (Train t) {
		 super(t);
		 this.numOfVehicles = t.numOfVehicles;
		 this.startStationName = t.startStationName;
		 this.destinationStationName = t.destinationStationName;
		 this.trainSerialNum = getNextSerialNumber();
		
	}
	 
	 
	 /**
	 * @return the numOfVehicles
	 */
	public int getNumOfVehicles() {
		return numOfVehicles;
	}

	/**
	 * @param numOfVehicles the numOfVehicles to set
	 */
	public void setNumOfVehicles(int numOfVehicles) {
		this.numOfVehicles = numOfVehicles;
	}

	/**
	 * @return the startStationName
	 */
	public String getStartStationName() {
		return startStationName;
	}

	/**
	 * @param startStationName the startStationName to set
	 */
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

	/**
	 * @return the destinationStationName
	 */
	public String getDestinationStationName() {
		return destinationStationName;
	}

	/**
	 * @param destinationStationName the destinationStationName to set
	 */
	public void setDestinationStationName(String destinationStationName) {
		this.destinationStationName = destinationStationName;
	}

	/**
	 * @return the trainSerialNum
	 */
	public long getTrainSerialNum() {
		return trainSerialNum;
	}


	public static long getNextSerialNumber() {
		 
		 return serialNumCounter ++; 
		
	 }
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
			
		Train x = (Train) obj;
		
		return super.equals(obj) && numOfVehicles == x.numOfVehicles
				&& startStationName.equals(x.startStationName)
				&& destinationStationName.equals(x.destinationStationName);
	}

	@Override
	public String toString() { 
		return "This Train – serial # "+ trainSerialNum+" of wheel Transportation - serial # "
				+ getWheelTransSerrialNum()
				+" - \nhas "+ numOfWheels+" wheels, has a maximum speed of "
				+ maxSpeed+"km/hr. It has "+ numOfVehicles 
				+ " vehicles and its starting and destination stations are " + startStationName
				+ " and " + destinationStationName;
	}
	
	
		 
}
