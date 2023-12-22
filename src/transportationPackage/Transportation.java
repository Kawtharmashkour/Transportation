package transportationPackage;

public abstract class Transportation {
	
	//The @Override annotation is not required for abstract methods, 
	//but using it is considered good practice because it helps catch errors 
	//at compile-time if the annotated method doesn't actually override a method 
	//in the superclass or interface.
	public abstract boolean equals(Object obj);
	public abstract String toString();
	
	//smallerBy use as solution no.1,
	//but solution 2 will be using Comparable built in interface
	public abstract boolean smallerBy(Object x);
	public abstract Object clone();
}
