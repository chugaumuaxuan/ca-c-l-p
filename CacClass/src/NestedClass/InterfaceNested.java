package NestedClass;

public class InterfaceNested {
	interface a{
		void run();
		
		interface b{
			void sing();
		}
	}
	
	class test implements a.b{
		
		public void sing() {
			System.out.println("Singing");
		}
		
		public void run() {
			System.out.println("Singing");
		}
	}
}
