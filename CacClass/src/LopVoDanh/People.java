package LopVoDanh;

interface Doing{
	void eat();
	void sleep();
}

abstract class Student{
	abstract void study();
}


public class People {
	
	Student st = new Student() {
		public void study() {
			System.out.println("studying");
		}
	};
	
	Doing d = new Doing() {
		public void eat() {
			System.out.println("eating");
		}
		public void sleep() {
			System.out.println("sleeping");
		}
	};


	public static void main(String[] args) {
		People p1 = new People();
	}
	
	
}
