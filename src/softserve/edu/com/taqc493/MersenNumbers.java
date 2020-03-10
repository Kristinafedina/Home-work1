package softserve.edu.com.taqc493;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MersenNumbers {

	public static void main(String[] args) {

		int m = 0;
		System.out.println("Enter m = ");

		try (Scanner sc = new Scanner(System.in)) {

			m = Integer.parseInt(sc.nextLine());

		} catch (Exception e) {
			System.out.println("Exception");
		}

		List<Integer> arr = new ArrayList<>();
		List<Integer> arr1 = new ArrayList<>();

		for (int i = 1; i <= m; i++) {
			int count = 0;
			for (int k = 1; k <= i; k++) {
				if (i % k == 0) {
					count++;
				}
			}

			if (count <= 2) {
				arr.add(i);
			}
		}

		System.out.println(arr);

		for (int i = 0; i < arr.size(); i++) {
			int a1 = (int) (Math.pow(2, arr.get(i)) - 1);
			System.out.println(a1);
			for (int j = 0; j < arr.size(); j++)
				if (a1 == arr.get(j)) {
					arr1.add(a1);
				}

		}
		System.out.println(arr1);
	}
}
