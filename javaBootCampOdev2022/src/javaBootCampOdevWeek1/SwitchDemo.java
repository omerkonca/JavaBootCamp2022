package javaBootCampOdev2022;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'E';
		
		switch (grade) {
		case 'A':
			System.out.println("M�kemmel, s�nav� ge�tiniz");			
			break;
		case 'B':		
		case 'C':
			System.out.println("�yi, s�nav� ge�tiniz");			
			break;
		case 'D':
			System.out.println("Fena de�il, s�nav� ge�tiniz");			
			break;
		case 'F':
			System.out.println("Maalesef kald�n�z");			
			break;

		default:
			System.out.println("Hatal� not girdiniz");
			break;
		}
		

	}

}
