package Interface;

import AbstractClass.main;
	
	interface ISinging {
		abstract void sing();
		void dance();
			
	}
	
	interface IPlaying {
		void gaming();
		
	}
	
	


	public abstract class People1 implements ISinging, IPlaying {
		String name;
		int age;
		abstract void study();
		
		void run() {
			System.out.println(" is running");
		}
		
	}	
	 class Student1 extends People1 implements ISinging, IPlaying{
		
		public void gaming() {
			 System.out.println("is dancing");
		 }
		 
		 public void dance() {
			 System.out.println("is dancing");
		 }
		 
		public void sing() {
			 System.out.println("is singing");
		 }
		 
		void study() {
			System.out.println(" is studying");
		}
		
		Student1(String name, int age){
			this.name = name;
			this.age = age;
		}
		
		public static void main(String[] args) {
			People1 p1 = new Student1("nam " ,22);
			System.out.println(p1.name + p1.age);
			p1.run();
			p1.study();
			p1.sing();
		}
		
	}

