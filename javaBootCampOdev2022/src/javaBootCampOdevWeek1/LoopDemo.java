package javaBootCampOdev2022;

public class LoopDemo {

	public static void main(String[] args) {
		System.out.println("1'den 10'a kadar tek say�lar;");
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("1'den 10'a kadar �ift say�lar;");
		for (int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For d�ng�leri bitti");
		
		//While
		
		int sayi = 1;
		
		while (sayi < 10) {
			System.out.println(sayi);
			sayi++;
		}
		
		System.out.println("While d�ng�s� bitti");
		
		//Do-While
		
		int sayi2 = 1;
		do {
			System.out.println(sayi2);
			sayi2 += 2;
		} while (sayi2 < 10);
		
		System.out.println("Do-while d�ng�s� bitti");
	}

}
