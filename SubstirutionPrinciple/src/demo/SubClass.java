package demo;

public class SubClass extends SuperClass {
	private int subClassProperty;

	public SubClass(int superClassProperty, int subClassProperty)
	{
		super(superClassProperty);
		this.subClassProperty = subClassProperty;
	}
	public int getSubClassProperty() {
		return subClassProperty;
	}

	public void setSubClassProperty(int subClassProperty) {
		this.subClassProperty = subClassProperty;
	}
}
