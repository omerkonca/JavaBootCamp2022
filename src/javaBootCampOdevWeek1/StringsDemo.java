package javaBootCampOdev2022;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String mesaj2;
		System.out.println(mesaj);
		
		System.out.println("Eleman sayýsý = " + mesaj.length());
		System.out.println("5. eleman = " + mesaj.charAt(4));
		System.out.println(mesaj2 = mesaj.concat(" yaþasýn"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0,5,karakterler,0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf("e"));
		
		
		//---------------------------------------------//
		
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2,4));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());

	}

}
