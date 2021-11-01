class Data{
	private	String name;
	private	Test score;
	
	class Test{
		int english , math;

		public Test(int a , int b){
			english = a;
			math = b;
		}
		double avg(){
			return (english + math) / 2;
		}
	}
	
	void Data(String c,int d,int e){
	    	name = c;
	    	score = new Test(d , e);
	}
	void show(){
		System.out.println("學生姓名:" + name);
		System.out.println("英文成績:" + score.english);
		System.out.println("數學成績:" + score.math);
		System.out.println("平均成績:" + score.avg());
	}
}

public class Class03 {
	public static void main(String[] args) {
		Data da = new Data();
		da.Data("Annie", 85, 92);
		da.show();
	}
}