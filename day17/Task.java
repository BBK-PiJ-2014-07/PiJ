import java.util.List;
import java.util.ArrayList;

public class Task implements Runnable {
	private int millisecs;
	private int threadNo;
	private FinishedTaskList finished;

	public Task(int millisecs, int threadNo, FinishedTaskList finished){
		this.millisecs = millisecs;
		this.threadNo = threadNo;
		this.finished = finished;
	}

	@Override
	public void run() {
		try {
			//sleep for the amount of ms input by the user
			Thread.sleep(millisecs);
			finished.add(threadNo);
		} catch (InterruptedException ex) {
			//finish early
		}
	}
}