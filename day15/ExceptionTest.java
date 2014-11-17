public class ExceptionTest {

	public static void main(String[] args) throws NewCheckedException {
		ExceptionTest et = new ExceptionTest();
		et.launch(); 
	}

	public void launch() {
		try {
			int i = Integer.parseInt(System.console().readLine());
				if (i == 0) {
					throw new NewRuntimeException("Runtime inside try block");
				} else if (i<0) {
					throw new NewCheckedException("Checked inside try block");
				}
			} catch (NewRuntimeException e) {
				e.printStackTrace();	
				} catch (NewCheckedException e) {
				e.printStackTrace();	
			}

	}


}