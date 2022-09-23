package javaBootCampOdev2022;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int number = -12;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;

		if(number < 1 ) {
			System.out.println("Geçersiz sayý");
			return;
		}
		
		if(number == 1) {
			System.out.println("Sayý asal deðildir");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Sayý asaldýr");
		}
		else {
			System.out.println("Sayý asal deðildir");
		}
	}

}
