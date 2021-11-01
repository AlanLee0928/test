package classtest;

class Cal_area{
	int a , b , c , d;
	
	void show(){
		System.out.println(this.Volume());
		System.out.println(this.area());
	}
	
	double Volume(){
		return (4 / 3) * 3.14159 * a * a * a;
	}
	int area() {
		return b * c * 2 + c * d * 2 + d * b * 2;
	}
}

public class test {
	public static void main(String[] args) {
		Cal_area ar = new Cal_area();
		ar.a = 10;
		ar.b = 4;
		ar.c = 5;
		ar.d = 6;
		ar.show();
	}
}