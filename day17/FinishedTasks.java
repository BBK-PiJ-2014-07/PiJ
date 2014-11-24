import java.util.ArrayList;
import java.util.List;

public class FinishedTasks {
	private List<Integer> list;

	public FinishedTasks(){
		list = new ArrayList<Integer>();
	}

	public synchronized void add(int num) {
		list.add(num);
	}

	public boolean isEmpty() {
		if (list.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public List<Integer> returnList(){
		return list;
	}
}