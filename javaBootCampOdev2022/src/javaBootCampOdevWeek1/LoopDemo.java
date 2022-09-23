package javaBootCampOdev2022;

public class LoopDemo {

	public static void main(String[] args) {
		System.out.println("1'den 10'a kadar tek sayýlar;");
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("1'den 10'a kadar çift sayýlar;");
		for (int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngüleri bitti");
		
		//While
		
		int sayi = 1;
		
		while (sayi < 10) {
			System.out.println(sayi);
			sayi++;
		}
		
		System.out.println("While döngüsü bitti");
		
		//Do-While
		
		int sayi2 = 1;
		do {
			System.out.println(sayi2);
			sayi2 += 2;
		} while (sayi2 < 10);
		
		System.out.println("Do-while döngüsü bitti");
	}

}
