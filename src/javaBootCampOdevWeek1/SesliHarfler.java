package javaBootCampOdev2022;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'E';
		
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("kal�n sesli harf");
			break;
			default:
				System.out.println("ince sesli harf");
		}

	}

}
