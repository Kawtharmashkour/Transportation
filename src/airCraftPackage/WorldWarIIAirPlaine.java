package airCraftPackage;

public class WorldWarIIAirPlaine extends AirCraft{

	 private boolean twinEngine; 
	 private long  worldWarIIAirPlaineSerrialNum;
	 private static long serialNumCounter = 80000;
	 
	//Constructors
		 public WorldWarIIAirPlaine() {
			 super();
			 this.twinEngine = true;
			 worldWarIIAirPlaineSerrialNum = getNextSerialNumber();
		 }
		 
		 public WorldWarIIAirPlaine(boolean twinEngine, double price, double maxElevation) {
			super(price, maxElevation);
			this.twinEngine = twinEngine;
			worldWarIIAirPlaineSerrialNum = getNextSerialNumber();
		}

		public WorldWarIIAirPlaine (WorldWarIIAirPlaine x) {
			 super(x);
			 this.twinEngine = x.twinEngine;
			 this.worldWarIIAirPlaineSerrialNum = getNextSerialNumber();

		}
		 
		 public boolean isTwinEngine() {
			return twinEngine;
		}

		public void setTwinEngine(boolean twinEngine) {
			this.twinEngine = twinEngine;
		}

		public long getWorldWarIIAirPlaineSerrialNum() {
			return worldWarIIAirPlaineSerrialNum;
		}

		public static long getNextSerialNumber() {
			 
			 return serialNumCounter ++; 
			
		 }
		 
		 @Override
			public boolean equals(Object obj) {
				if (obj == null || getClass() != obj.getClass()) {
					return false;
				}
					
				WorldWarIIAirPlaine x = (WorldWarIIAirPlaine) obj;
				
				return super.equals(obj) && twinEngine == x.twinEngine;
			}

		@Override
		public String toString() {
			return "WorldWarIIAirPlaine - serial # "+ worldWarIIAirPlaineSerrialNum
					+" of AirCraft - serial # "+ getAirCraftSerrialNum() 
					+"\nwith price=" + price + ", maxElevation=" + maxElevation
					+" and twinEngine=" + twinEngine;
		}
		 
}
