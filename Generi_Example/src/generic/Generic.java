package generic;

public class Generic<T> {

	private T first_name;
	private T last_name;
	
	public T getFirst_name() {
		return first_name;
	}
	public void setFirst_name(T first_name) {
		this.first_name = first_name;
	}
	public T getLast_name() {
		return last_name;
	}
	public void setLast_name(T last_name) {
		this.last_name = last_name;
	}


}
