package softserve.edu.com.taqc493;

import java.util.Arrays;

public class Fibonacci {

	private static final double m = Math.sqrt(5.0);
	private static final double k = 1.0 / m;
	private static final double l = (1 + m) / 2.0;

	public static Integer[] firstWay() {
		Integer[] array = new Integer[15];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		return array;
	}

	public static Double[] secondWay() {
		Double[] array = new Double[15];
		for (int i = 0; i < array.length; i++) {
			array[i] = k * Math.pow(l, i);
		}
		return array;
	}

	public static Double[] compareWay() {

		Double[] arrayCompare = new Double[15];
		for (int i = 0; i < arrayCompare.length; i++) {
			arrayCompare[i] = Math.abs(secondWay()[i] - firstWay()[i]);
		}
		return arrayCompare;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.asList(Fibonacci.firstWay()));
		System.out.println(Arrays.asList(Fibonacci.secondWay()));
		System.out.println(Arrays.asList(Fibonacci.compareWay()));
	}

}
