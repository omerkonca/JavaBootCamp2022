package javaBootCampOdev2022;

public class RecapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 10, sayi2 = 20, sayi3 =30, enBuyuk = sayi1;
		
		
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if(enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük sayý = " + enBuyuk);

	}

}
