package softserve.edu.com.taqc493;

import java.util.HashSet;
import java.util.Set;

public class MultipleNum {

	private int first;
	private int second;

	public MultipleNum(int first, int second) {
		this.first = first;
		this.second = second;
	}

	private int product() {
		return first * second;
	}

	private  Set<Integer> firstToSet() {
		Set<Integer> firstSet = new HashSet<>();
		int i = 2;
		while ((first * i) <= product()) {
			firstSet.add(first * i);
			i++;
		}
		return firstSet;

	}

	private Set<Integer> secondToSet() {
		Set<Integer> secondSet = new HashSet<>();
		int i = 2;
		while ((second * i) <= product()) {
			secondSet.add(second * i);
			i++;
		}
		return secondSet;
	}

	public Set<Integer> comonSet() {
		Set<Integer> uniSet = new HashSet<>();
		uniSet.addAll(firstToSet());
		uniSet.addAll(secondToSet());
		Set<Integer> unX = new HashSet<>(uniSet);
		unX.removeAll(firstToSet());
		Set<Integer> unY = new HashSet<>(uniSet);
		unY.removeAll(secondToSet());
		Set<Integer> intersection = new HashSet<>(uniSet);
		intersection.removeAll(unX);
		intersection.removeAll(unY);
		return intersection;

	}

}
