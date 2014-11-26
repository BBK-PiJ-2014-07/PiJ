import java.util.concurrent.Executor;
import java.util.LinkedList;
import java.util.Queue;

public class ExecutorImpl implements Executor {
	private Queue<Runnable> taskQueue;
	//private Thread t;
	public ExecutorImpl(){
		taskQueue = new LinkedList<Runnable>();
	}
// Execute one Runnable at a time; queue of impending tasks.

	/**
	** Executes the given command at some time in the future.
	** The command may execute in a new thread, in a pooled
	** thread, or in the calling thread, at the discretion 
	** of the Executor implementation.
	**
	** @param command - the runnable task
	**/
	public synchronized void execute(Runnable r){
		//add the task to the queue
		this.taskQueue.offer(r);
		//t.run();
	}

	public int getMaxPendingTime(){
		return taskQueue.size()*1000;
	}
	
}