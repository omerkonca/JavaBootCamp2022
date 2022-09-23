package javaBootCampOdev2022;

public class RecapDemo2 {

	public static void main(String[] args) {
		double myList[] = {1.2, 5.3, 3.4, 4.5};
		double total = 0, max = myList[0];;
		
		
		for (double number : myList) {
			if(max < number) {
				max = number;
			}
			total += number;
		}
		System.out.println("Toplam = " + total );
		System.out.println("En büyük = " + max );

	}

}
