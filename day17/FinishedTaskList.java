import java.util.ArrayList;
import java.util.List;

public class FinishedTaskList {
	private List<Integer> list;

	public FinishedTaskList(){
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
	public void clear(){
		list.clear();
	}
	
	public List<Integer> returnList(){
		return list;
	}
}