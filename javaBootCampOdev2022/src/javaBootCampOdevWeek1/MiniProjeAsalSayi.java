package javaBootCampOdev2022;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int number = -12;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if(number < 1 ) {
			System.out.println("Ge�ersiz say�");
			return;
		}
		
		if(number == 1) {
			System.out.println("Say� asal de�ildir");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Say� asald�r");
		}
		else {
			System.out.println("Say� asal de�ildir");
		}
	}

}
