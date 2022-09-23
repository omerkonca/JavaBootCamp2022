package javaBootCampOdev2022;

public class ArraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "Zafer";
		String ogrenci2 = "Sinan";
		String ogrenci3 = "Kenan";
		String ogrenci4 = "Enes";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("----------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Kayra";
		ogrenciler[1] = "Kadir";
		ogrenciler[2] = "Ertuðrul";
		ogrenciler[3] = "Görkem";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
			
		}
		
		System.out.println("----------------------");
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
