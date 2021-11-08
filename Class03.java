package Class03;

class Data{
	private	String name;
	private	Test score;
	
	class Test{
		int english , math;

		public Test(int eng , int m){
			english = eng;
			math = m;
		}
		double avg(){
			return (english + (double)math) / 2;
		}
	}
	void Data(String a,int b,int c){
	    	name = a;
	    	score = new Test(b , c);
	}
	void show(){
		System.out.print("name:" + name + " ");
		System.out.print("english:" + score.english + " ");
		System.out.print("math:" + score.math + " ");
		System.out.println("avg:" + score.avg());
	}
}

public class Class03 {
	public static void main(String[] args) {
		Data da = new Data();
		Data Da = new Data();
		da.Data("Annie", 85, 92);
		Da.Data("Brain", 77, 56);
		da.show();
		Da.show();
	}
}
