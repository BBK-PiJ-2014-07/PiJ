public class Company {
	private String companyName;
	private LinkedList<String> employeeNames;
	private LinkedList<String> nationalInsurance;

	public Company(String name) {
		companyName = name;
		employeeNames = new LinkedList<String>();
		nationalInsurance = new LinkedList<String>();
	}

	public static void main(String[] args) {

		Company myCo = new Company("myCo");

		myCo.run();

	}

	public void run(){

		employeeNames.makeHead("Fred");
		String[] names = {"Alan", "Sarah", "Lizzie", "George", "Michael", "Lucy", "Tom", "Mark", "Rebecca"};
		employeeNames.populate(names);

		nationalInsurance.makeHead("AB 12 23 34 A");
		String[] nINumbers = {"BC 23 34 45 B", "CD 34 45 56 C", "DE 45 56 67 D", "EF 56 67 78 E", "FG 67 78 89 F", "GH 78 89 90 G", "HI 89 90 01 H", "IJ 90 01 12 I", "JK 01 12 23 J"};
		nationalInsurance.populate(nINumbers);

		employeeNames.printList();
		nationalInsurance.printList();
	}
}