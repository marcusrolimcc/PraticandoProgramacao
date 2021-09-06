package src;

public class Application {

	public static void main(String[] args) {

		int num[] = { 11, 22, 33, 4, 5, 6, 7, 8, 9, 10 };
		int a = num[0];
		int b = num[1];
		int c = num[2];	

		for(int i = 0; i < num.length ; i++) {
			int x = num[i];
			if(a >= x ) {
				a = x;
			}else if(b >= x && x != a) {
				b = x;
			}else if (c > b && x <= c ) {
				c = x;
		}
		}
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}

