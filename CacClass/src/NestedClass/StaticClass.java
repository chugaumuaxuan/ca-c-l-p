package NestedClass;

public class StaticClass {
	int c = 4;
	
	static class number{
		int a = 1;
		int b = 3;
		
		void sum() {
			int tong = a +b ;
			System.out.println(tong);
		}
	}
	
	public class main{
		public static void main(String[] args) {
			StaticClass.number nb = new StaticClass.number();
			nb.sum();
		}
	}
}

