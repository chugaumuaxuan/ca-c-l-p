package AbstractClass;

public abstract class People {
	
	abstract void run();
	
	String name;
	int age;

	
//	People(){}
//	
//	People(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	static {
//		System.out.println("abc");
//	}
	
	void display() {
		System.out.println("hello world");
	}	
}

	class Student extends People{
		int id;
		
		Student(String name, int age, int id) {
			this.name = name;
			this.age = age;
			this.id = id;
		}

		void run() {
			System.out.println("Chay");
		}
	}
	
	

	
	
	
	