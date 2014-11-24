public class ResponsiveUi {


	public static void main(String[] args){
			ResponsiveUi r = new ResponsiveUi();
			r.launch();
	}

	public void launch(){
		FinishedTaskList finishedTaskList = new FinishedTaskList();

		for (int i=1; i<11; i++){
			System.out.println("Enter the duration (in ms) of task " + i + ":");
			int millisecs = Integer.parseInt(System.console().readLine());
			
			if (!finishedTaskList.isEmpty()){
				System.out.println("Finished tasks: " + finishedTaskList.returnList().toString());
				finishedTaskList.clear();
			}
			
			Runnable task = new Task(millisecs, i, finishedTaskList);
			Thread t = new Thread(task);
			t.start();
		}
	}
}