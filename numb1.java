public class numb1 {
	//Find the sum of numbers less than 1000 which are divisible by 3 or 5
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i < 1000; i++) {
			if ((i%3) == 0)
				total += i;
			else if ((i%5) == 0)
				total += i;
		}
	
		System.out.println(total);
	}
}