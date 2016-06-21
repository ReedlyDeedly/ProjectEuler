public class numb2 {
	public static void main(String[] args) {
		int total = 0;
		int a = 1, b = 1, c = 2;
		while(c < 4000000) {
			if((c%2) == 0) {
				total += c;
				System.out.println(c);
			}
			a = b;
			b = c;
			c = a + b;
			System.out.println(a + " " + b + " " + c);
		}
		System.out.println(total);
	}
}