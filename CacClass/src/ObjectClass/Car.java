package ObjectClass;

public class Car {
	String name;
	
	Car(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		Car x1 = new Car("Toyota");
		Car x2 = new Car("Toyota");
				
		System.out.println(x1.equals(x2));
	}
}
