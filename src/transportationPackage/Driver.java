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
		try {
			int i;
			
			Object[] newArr = new Object[arr.length];
			
			for(i=0; i<arr.length; i++) {
				
				if(arr[i] != null) {
					Constructor[] x = arr[i].getClass().getConstructors();
					newArr[i] = x[2].newInstance(arr[i]);
				}
			}
			return newArr;
		} catch (InstantiationException e) {
            System.out.println("Error: Unable to instantiate object.");
            return null;
        }
		
		
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
			wt3 = wt2.clone();
			
			
			//System.out.println("\n--- MonoWheeles Transportation ---\n");
			mw1 = new Monowheels ();
			mw2 = new Monowheels (2, 50);
			//mw3 = new Monowheels (mw1);
			
			//System.out.println("\n--- Watercraft Transportation ---\n");
			f1 = new Ferry ();
			f2 = new Ferry (2, 50);
			f3 = f1.clone();
			
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
			
			Object[] a1 = {wt1,wt2,mw1,mw2,f1,f2,train1,train2,m1,m2,t1,t2,ac2,ac1};
			Object[] a2 = {wt1,wt2,mw1,mw2,f1,f2,train1,train2,m1,m2,t1,t2,f3,wt3};
			
			System.out.println("\nResult of Array1:");
			findLeastAndMostExpensiveAircraft(a1);
			System.out.println("\nResult of Array2:");
			findLeastAndMostExpensiveAircraft(a2);
			
	}
	
	public static void 	sortArray(AirCraft[] arr) {
		try {
            int i, j;
            AirCraft temp;

            for (i = 0; i < arr.length; i++) {
                for (j = i; j < arr.length; j++) {
                    if (arr[j].smallerBy(arr[i])) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } catch (NullPointerException e) {
            System.err.println("Error: Null array in sortArray");
        } catch (Exception e) {
            System.err.println("Error in sortArray: " + e.getMessage());
        }
		
	}
	
	public static AirCraft[] appendToArray(AirCraft[] arr, AirCraft element) {	
		try {
            int i;

            AirCraft[] newArr = new AirCraft[arr.length + 1];

            for (i = 0; i < arr.length; i++) {
                newArr[i] = arr[i].clone();
            }
            newArr[arr.length] = element.clone();

            return newArr;
        } catch (NullPointerException e) {
            System.err.println("Error: Null array in appendToArray");
            return arr; 
        } catch (Exception e) {
            System.err.println("Error in appendToArray: " + e.getMessage());
            return arr; 
        }
	}
	
	public static void findLeastAndMostExpensiveAircraft(Object[] arr) {
		try {
            int i;
            AirCraft[] acArr = new AirCraft[0];

            for (i = 0; i < arr.length; i++) {
                if (arr[i] instanceof AirCraft) {
                    AirCraft element = (AirCraft) arr[i];
                    acArr = appendToArray(acArr, element);
                }
            }
            // Sorting the array
            sortArray(acArr);

            if (acArr.length > 0) {
                if (acArr.length == 1) {
                    System.out.println("The least and most expensive aircraft is:");
                    System.out.println(acArr[0]);
                } else {
                    System.out.println("The least expensive aircraft is:");
                    System.out.println(acArr[0]);
                    System.out.println("The most expensive aircraft is:");
                    System.out.println(acArr[acArr.length - 1]);
                }
            } else {
                System.out.println("No Aircraft found.");
            }
        } catch (NullPointerException e) {
            // Handle null array
            System.err.println("Error: Null array in findLeastAndMostExpensiveAircraft");
        } catch (Exception e) {
            // Handle other exceptions
            System.err.println("Error in findLeastAndMostExpensiveAircraft: " + e.getMessage());
        }
	}
	
	public static void printArray(Object[] a) {
		try {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
                System.out.println();
            }
        } catch (NullPointerException e) {
            // Handle null array
            System.err.println("Error: Null array in printArray");
        } catch (Exception e) {
            // Handle other exceptions
            System.err.println("Error in printArray: " + e.getMessage());
        }
		
	}
}
