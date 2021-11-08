package Class02;

import java.util.*;

class is_prime{
	int a , b;
	
	void prime() {
		for(int i = 2 ; i <= (a / 2) ; i++) {
			if(a % i == 0) {
				b = 0;
				break;
			}
			else {
				b = 1;
			}
		}
		if(b == 1) {
			System.out.println("YES");
		}
		else {
			System.out.println("No");
		}
	}
}

public class Class02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		is_prime pr = new is_prime();
		pr.a = sc.nextInt();
		pr.prime();
	}
}
