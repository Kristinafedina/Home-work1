package softserve.edu.com.taqc493;

import java.util.ArrayList;
import java.util.List;

public class Suma {

	private int m;
	private int n;
	
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	@Override
	public String toString() {
		return "Suma [m=" + m + ", n=" + n + "]";
	}
	public Suma(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	private String[] sumToArray(){
		String[] list = Integer.toString(m).split("");
		return list;
	}
	
	public int countSum() {
	if (Integer.toString(m).length() < n) {
		throw new IndexOutOfBoundsException ();
	}
	if (n <= 0) {
		throw new NullPointerException ();
	}
	String[] list = sumToArray();
	int sum = 0;
	for(int i =0 ; i < n; i++)		{
		sum = sum + Integer.valueOf(list[i]);
	}
		return sum;
		
	}
	
}
