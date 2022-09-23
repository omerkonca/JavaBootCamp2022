package javaBootCampOdev2022;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'E';
		
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel, sýnavý geçtiniz");			
			break;
		case 'B':		
		case 'C':
			System.out.println("Ýyi, sýnavý geçtiniz");			
			break;
		case 'D':
			System.out.println("Fena deðil, sýnavý geçtiniz");			
			break;
		case 'F':
			System.out.println("Maalesef kaldýnýz");			
			break;

		default:
			System.out.println("Hatalý not girdiniz");
			break;
		}
		

	}

}
