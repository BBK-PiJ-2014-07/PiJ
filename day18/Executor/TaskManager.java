import java.util.concurrent.*;
import java.util.LinkedList;
import java.util.Queue;

public class TaskManager implements Runnable {
	private Queue<Runnable> taskQueue;
	private Boolean isRunning;

	public TaskManager(){
		this.taskQueue = new LinkedList<Runnable>();
		isRunning = true;

	}

	public void run(){
		//1. Check if task pending
			while (isRunning) {
				while (!taskQueue.isEmpty()){
				// 2. if yes, run it
					Runnable nextTask = taskQueue.poll();
					nextTask.run();
				//3. if no, repeat
				}
			}
	}

	public void shutdown(){
		this.isRunning = false;
	}
	public void addTask(Runnable task){
		this.taskQueue.offer(task);
	}

	public int getQueueSize(){
		return taskQueue.size();
	}

}