package NestedClass;

public class HinhHoc {	
	String name;
	int b =3;
	int sum;
	
	HinhHoc(String name){
		this.name = name;
	}
	
	
	class chieudai{
		int length = 3;	
		
		void display1() {
			System.out.println(" chieu dai la: " + length );
		}
		
	}
	class chieurong{
		int width = 2;
		void display2() {
			System.out.println(" chieu rong la: " + width );
		}
	}
	
	public static void main(String[] args) {
		HinhHoc hcn = new HinhHoc("Hinh chu nhat");
		
		HinhHoc.chieudai cd = hcn.new chieudai();
		
		HinhHoc.chieurong cr = hcn.new chieurong();
		
		cd.display1();
		cr.display2();
				
	}

}
