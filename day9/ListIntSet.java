public class ListIntSet implements IntSet {
	int value;
	ListIntSet next;

	public ListIntSet(int value) {
		this.value = value;
		next = null;
	}

	public void add(int newNumber) {
		ListIntSet l = new ListIntSet(newNumber);
		if (this.next == null) {
			this.next = l;
		} else {
			this.next.add(newNumber);
		}
	}

	public boolean contains(int n) {
		if (this.value == n) {
			return true;
		} else {
			if (this.next == null) {
				return false;
			} else {
				return this.next.contains(n);
			}
		}
	}

	public boolean containsVerbose(int n) {
		System.out.print(this.value + ", ");
		if (this.value == n) {
			return true;
		} else {
			if (this.next == null) {
				return false;
			} else {
				return this.next.contains(n);
			}
		}
	}	

	public String toString() {
		String result = "";
		result = result + this.value + ", "; 
		if (this.next != null){
			result = result + this.next.toString();
		}
		return result;
	}

}