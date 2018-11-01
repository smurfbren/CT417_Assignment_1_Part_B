
import org.joda.time.LocalDate;


public class Student_Reg_Driver {
	
	
	public static void main(String args[]){
		
		Course Eng = new Course("English", LocalDate.parse("2015-7-13"), LocalDate.parse("2018-8-21"));
		
		Module Writing = new Module("Writing" + " ", "CT112");
		Module Poetry = new Module("Poetry" + " ", "CT123");
		Module History = new Module("History" + " ", "CT214");
		
		Student Liam = new Student("Liam Morgan", 21, null, 15, Eng);
		Student Mary = new Student("Mary Red", 19, null, 18, Eng);
		
		Eng.setModules(Writing);
		Eng.setModules(Poetry);
		Eng.setModules(History);
		
		Writing.setCourse(Eng);
		Poetry.setCourse(Eng);
		History.setCourse(Eng);
		
		Writing.setStudent(Liam);
		History.setStudent(Liam);
		Poetry.setStudent(Liam);
		
		Writing.setStudent(Mary);
		History.setStudent(Mary);
		Poetry.setStudent(Mary);

		Liam.setModule(History);
		Liam.setModule(Writing);
		Liam.setModule(Poetry);
		
		Mary.setModule(History);
		Mary.setModule(Writing);
		Mary.setModule(Poetry);
		
		System.out.println(Eng + "\n \n");
		System.out.println(Writing + "\n \n");
		System.out.println(History + "\n" + " \n");
		System.out.println(Poetry + "\n \n");
	
	}
}