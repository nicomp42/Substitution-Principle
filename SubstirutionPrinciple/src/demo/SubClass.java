/*
 * Substitution Principle
 * A derived class object can be assigned to a base class object
 * This is the derived class
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */package demo;

 /**
  * A class acting as a derived class in our demo
  * @author nicomp
  *
  */
public class SubClass extends SuperClass {
	private int subClassProperty;

	/**
	 * Constructor
	 * @param superClassProperty A value stored in the base class
	 * @param subClassProperty A value stored in the derived class
	 */
	public SubClass(int superClassProperty, int subClassProperty)
	{
		super(superClassProperty);
		this.subClassProperty = subClassProperty;
	}
	/**
	 * 
	 * @return The value that was stored in the derived class
	 */
	public int getSubClassProperty() {
		return subClassProperty;
	}
	/**
	 * 
	 * @param subClassProperty The value that was stored in the derived class
	 */
	public void setSubClassProperty(int subClassProperty) {
		this.subClassProperty = subClassProperty;
	}
}
