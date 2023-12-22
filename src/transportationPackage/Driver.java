package transportationPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import airCraftPackage.AirCraft;
import airCraftPackage.WorldWarIIAirPlaine;
import metroPackage.Metro;
import monoWheelsPackage.Monowheels;
import railTransportPackage.Train;
import railTransportPackage.Tram;
import waterCraftPackage.Ferry;
import wheeledTransportPackage.WheeledTransportation;

public class Driver {
	
	public static Object[] copyTheObjects(Object[] arr) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int i;
		
		Object[] newArr = new Object[arr.length];
		
		for(i=0; i<arr.length; i++) {
			
			if(arr[i] != null) {
				Constructor[] x = arr[i].getClass().getConstructors();
				newArr[i] = x[2].newInstance(arr[i]);
			}
		}
		return newArr;
		
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			WheeledTransportation wt1, wt2, wt3;
			Monowheels mw1,mw2,mw3;
			Ferry f1, f2, f3;
			Train train1, train2, train3;
			Metro m1, m2, m3;
			Tram t1, t2, t3;
			AirCraft ac1, ac2;
			WorldWarIIAirPlaine x1,x2;
			
			//System.out.println("\n--- Wheeled Transportation ---\n");
			wt1 = new WheeledTransportation ();
			wt2 = new WheeledTransportation (2000, 50);
			//wt3 = wt2.clone();
			
			
			//System.out.println("\n--- MonoWheeles Transportation ---\n");
			mw1 = new Monowheels ();
			mw2 = new Monowheels (2, 50);
			//mw3 = new Monowheels (mw1);
			
			//System.out.println("\n--- Watercraft Transportation ---\n");
			f1 = new Ferry ();
			f2 = new Ferry (2, 50);
			//f3 = f1.clone();
			
			//System.out.println("\n--- Train Transportation ---\n");
			train1 = new Train ();
			train2 = new Train (12, "London", "Vancouver", 48, 150);
			//train3 = new Train (train1);
			
			//System.out.println("\n--- Metro Transportation ---\n");
			m1 = new Metro ();
			m2 = new Metro (7, 1, "Toronto", "Ottawa", 4, 1000);
			//m3 = new Metro (m1);

			//System.out.println("\n--- Tram Transportation ---\n");
			t1 = new Tram ();
			t2 = new Tram (2015, 9, 2, "Laval", "Brossard", 4, 15);
			//t3 = new Tram (t1);
			
			//System.out.println("\n--- Aircraft Transportation ---\n");
			ac1 = new AirCraft ();
			ac2 = new AirCraft ( 455.18, 25.5);
			
			//System.out.println("\n--- World War II AirPlaine Transportation ---\n");
			x1 = new WorldWarIIAirPlaine ();
			x2 = new WorldWarIIAirPlaine (false,99000, 30.5);
			
			Object[] arr1 = {wt1,wt2,mw1,mw2,f1,f2,train1,train2,m1,m2,t1,t2,ac2,ac1};
			
			System.out.println("-- Array before copy --");
			printArray(arr1);
			
			Object[] arr2 = copyTheObjects(arr1);
			
			System.out.println("-- Array after copy --");
			printArray(arr2);
			
			
	}
	
	public static void printArray(Object[] a) {
		for(int i=0 ; i< a.length; i++) {
			System.out.println(a[i]);
			System.out.println();
		}
		
	}
}
