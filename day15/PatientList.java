import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class PatientList {
	private List<Patient> patients;

	public PatientList(){
		patients = new ArrayList<Patient>();
	}

	public static void main(String[] args){
		PatientList pl = new PatientList();
		pl.launch();
	}

	public void launch(){
		patients.add(new Patient("John", 1995));
		patients.add(new Patient("Sarah", 2010));
		patients.add(new Patient("George", 1956));
		patients.add(new Patient("Fred", 1900));
		patients.add(new Patient("Tom", 1899));
		for (Patient p: patients){
			System.out.println(p.getName() + ", " + p.getYearOfBirth());
		}
	}

}