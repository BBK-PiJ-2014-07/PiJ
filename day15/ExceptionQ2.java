import java.util.ArrayList;

public class ExceptionQ2 {
	public void launch(){
		try {
			ArrayList<String> list = new ArrayList<String>();
			list.add("Hello");
			list.add("World");
		} catch (Exception ex){
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}	
	}

}