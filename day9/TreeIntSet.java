public class TreeIntSet implements IntSet {
	int value;
	TreeIntSet left;
	TreeIntSet right;

	public TreeIntSet(int value) {
		this.value = value;
		left = null;
		right = null;
	}


	public void add(int newNumber) {
		if (!this.contains(newNumber)) {
			if (newNumber > this.value) {
				if (right == null) {
					right = new TreeIntSet(newNumber);
				} else {
					right.add(newNumber);
				}
			} else {
				if (left == null) {
					left = new TreeIntSet(newNumber);
				} else {
					left.add(newNumber);
				}
			}
		}
	}

	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
		
	}

	public boolean containsVerbose(int n) {
	    System.out.print(this.value + ", ");
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
			return false;
			} else {
				return right.containsVerbose(n);

			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.containsVerbose(n);
			}
		}
		
	}

	public String toString() {
		String result = this.value + ", ";
		if (left != null) {
			result = result + left.toString();
		}
		if (right != null) {
			result = result + right.toString();
		}
		return result;
	}

}