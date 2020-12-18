
public class Swap<T> {
	private T first, second;

	public Swap(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	public void swap() {
		T t = first;
		first = second;
		second = t;

	}

	@Override
	public String toString() {
		return " first= [ " + first + " ], second= [ " + second + " ]";
	}

}
