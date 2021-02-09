/*
 * Substitution Principle
 * A derived class object can be assigned to a base class object
 * This is the base class
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package demo;

public class SuperClass {
	
	private int superClassProperty;

	public SuperClass(int superClassProperty) {
		this.superClassProperty = superClassProperty;
	}

	public int getSuperClassProperty() {
		return superClassProperty;
	}

	public void setSuperClassProperty(int superClassProperty) {
		this.superClassProperty = superClassProperty;
	}
}
