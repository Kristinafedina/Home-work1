package softserve.edu.com.taqc493;

import java.util.Scanner;

public class Appl {

	public static void main(String[] args) {

		System.out.println("Enter m = ");
		System.out.println("Enter numbers of digits m, n = ");

		int m = 0;
		int n = 0;

		try (Scanner sc = new Scanner(System.in)) {

			m = Integer.parseInt(sc.nextLine());
			n = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Exception");
		}

		Suma suma = new Suma(m, n);
		System.out.println(suma.countSum());

		MultipleNum mt = new MultipleNum(6, 4);
		System.out.println(mt.comonSet());

	}
}
