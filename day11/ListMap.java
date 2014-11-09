public class ListMap implements SimpleMap {
	private LinkedList<T> keys;
	private LinkedList<T> values;

	public ListMap(LinkedList<T> keys, LinkedList<T> values) {
		this.values = values;
		this.keys = keys;
	}

	public void put(T newKey, T newValue) {
		keys.add(newKey);
		values.add(newValue);
	}

	public String get(T key) {
		return values.getValue()
}