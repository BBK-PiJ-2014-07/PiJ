import java.util.Calendar;

public class Patient {
	private String name;
	private int yearOfBirth;
	private int currentYear;

	public Patient(String name, int yearOfBirth) throws IllegalArgumentException {
		currentYear = Calendar.getInstance().get(Calendar.YEAR);
			if (currentYear - yearOfBirth >= 0 && currentYear - yearOfBirth <= 130) {
				this.name = name;
				this.yearOfBirth = yearOfBirth;
			} else {
				throw new IllegalArgumentException("Invalid year of birth!");
			}
	}

	public String getName(){
		return name;
	}

	public int getYearOfBirth(){
		return yearOfBirth;
	}



}