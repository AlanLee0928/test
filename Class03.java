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
		System.out.println("�ǥͩm�W:" + name);
		System.out.println("�^�妨�Z:" + score.english);
		System.out.println("�ƾǦ��Z:" + score.math);
		System.out.println("�������Z:" + score.avg());
	}
}

public class Class03 {
	public static void main(String[] args) {
		Data da = new Data();
		da.Data("Annie", 85, 92);
		da.show();
	}
}