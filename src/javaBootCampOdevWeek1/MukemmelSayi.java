package javaBootCampOdev2022;

public class MukemmelSayi {

	public static void main(String[] args) {
		int sayi = 6;
		int total = 0;
		
		for (int i = 1; i < sayi; i++) {
			if(sayi % i == 0) {
				total = total + i;
			}
			}

		if(total == sayi) {
			System.out.println("m�kemmel say�d�r");
		}
		else {
			System.out.println("m�kemmel say� de�ildir");
		}

	}

}
