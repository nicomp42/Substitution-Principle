/*
 * Substitution Principle
 * A derived class object can be assigned to a base class object
 * This is the base class
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package demo;

/**
 * A class acting as a base class in our demo
 * @author nicomp
 *
 */
public class SuperClass {
	
	private int superClassProperty;

	/**
	 * Constructor
	 * @param superClassProperty The value to be stored in the base class
	 */
	public SuperClass(int superClassProperty) {
		this.superClassProperty = superClassProperty;
	}

	/**
	 * 
	 * @return The value stored in the base class
	 */
	public int getSuperClassProperty() {
		return superClassProperty;
	}
	/**
	 * 
	 * @param superClassProperty The value to be stored in the base class
	 */
	public void setSuperClassProperty(int superClassProperty) {
		this.superClassProperty = superClassProperty;
	}
}
