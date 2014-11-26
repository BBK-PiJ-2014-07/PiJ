import java.util.concurrent.*;
import java.util.LinkedList;
import java.util.Queue;

public class TaskManager implements Runnable {
	private Queue<Runnable> taskQueue;

	public TaskManager(){
		this.taskQueue = new LinkedList<Runnable>();

	}

	public void run(){
		//1. Check if task pending
		while (!taskQueue.isEmpty()){
		// 2. if yes, run it
			Runnable nextTask = taskQueue.poll();
		//3. if no, repeat
		}
	}


}