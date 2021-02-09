package demo;

public class Main {

	public static void main(String[] args) {
		SuperClass mySuperClass;
		SubClass mySubClass = new SubClass(42, 100);
		
		mySuperClass = mySubClass;	// Substitution Principle
		
		System.out.println(mySuperClass.getSuperClassProperty());
		
		//System.out.println(mySuperClass.getSubClassProperty());	// Won't build. Explain why
		

	}

}
