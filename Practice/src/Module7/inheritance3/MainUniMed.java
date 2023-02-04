package Module7.inheritance3;

public class MainUniMed {

	public static void main(String[] args) {

		University u1 = new University ();
		
		
		MedSchool m1 = new MedSchool();
		
		System.out.println(m1.duration);
		
		m1.minCreditsPerSemester = 25;
		m1.minCreditsToGraduate = 120;
		
		m1.graduationRequirements();
		m1.printMinCreditsPerSemester();

	}

}
