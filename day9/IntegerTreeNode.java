public class IntegerTreeNode {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	public IntegerTreeNode(int value) {
		this.value = value;
		left = null;
		right = null;
		}

	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
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

	public int getMax() {
		if (right == null) {
			return this.value;
		} else {
			return right.getMax();
		}

	}

	public int getMin() {
		if (left == null) {
			return this.value;
		} else {
			return left.getMin();
		}
		
	}

	public String toString() {
		String result = "[" + this.value + " L";
		if (left == null) {
			result = result + "[] R";
		} else {
			result = result + left.toString() + " R";
		}
		if (right == null) {
			result = result + "[]]";
		} else {
			result = result + right.toString() + "]";
		}
		return result;
	}

	public int depth() {
		int result = 1;
		if (left != null) {
			result = result + left.depth();
		}
		if (right != null) {
			result = result + right.depth();
		}
		return result;
	}


}	