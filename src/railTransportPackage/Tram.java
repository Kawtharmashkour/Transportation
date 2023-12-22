package railTransportPackage;

import metroPackage.Metro;

public class Tram extends Metro{
	 protected int yearCreation; 
	 private long tramSerialNum;
	 private static long serialNumCounter = 30000;
	 
	 //Constructors
	 public Tram() {
		super();
		this.yearCreation = 2006;
		this.tramSerialNum = getNextSerialNumber();
	 }
	 
	 public Tram(int yearCreation, int numOfStops, int numOfVehicles, String startStationName, String destinationStationName, int numOfWheels, double maxSpeed) {
		super(numOfStops, numOfVehicles, startStationName, destinationStationName, numOfWheels, maxSpeed);
		this.yearCreation = yearCreation;
		this.tramSerialNum = getNextSerialNumber();
	}

	public Tram (Tram t) {
		 super(t);
		 this.yearCreation = t.yearCreation;
		 this.tramSerialNum = getNextSerialNumber();

	}
	
	//Getter and Setter
	public int getYearCreation() {
		return yearCreation;
	}

	public void setYearCreation(int yearCreation) {
		this.yearCreation = yearCreation;
	}

	public long getTramSerialNum() {
		return tramSerialNum;
	}

	public void setTramSerialNum(long tramSerialNum) {
		this.tramSerialNum = tramSerialNum;
	}

	public static long getNextSerialNumber() {
		 
		 return serialNumCounter ++; 
		
	 }
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
			
		Tram x = (Tram) obj;
		
		return super.equals(obj) && yearCreation == x.yearCreation;
	}

	@Override
	public String toString() { 
		return "This tram  – serial # "+ tramSerialNum 
				+" of metro – serial # "+getMetroSerialNum()+" of Train – serial # "
						+ getTrainSerialNum()+" of wheel Transportation - serial # "
						+ getWheelTransSerrialNum()
						+" - \nhas "+ numOfWheels+" wheels, has a maximum speed of "
						+ maxSpeed+"km/hr. It has "+ numOfVehicles 
						+ " vehicles and its starting and destination stations are " + startStationName
						+ " and " + destinationStationName
						+", with numOfStops=" + numOfStops+", yearCreation=" + yearCreation;
	}
	
	

}
