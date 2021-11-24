public class Students{
	int admissions;
	String course;
	int roll_no;
	
	public Students(int year1, String course1, int rollno1){
		admissions = year1;
		course = course1;
		roll_no = rollno1;
		
	}
	
	public String getunique_id(int year){
		System.out.println("From the Students Class -");
		String unique_id1 = year + course + roll_no;
		return unique_id1;
	}
	
	public String getunique_id(){
		String unique_id2 = roll_no + course + admissions;
		return unique_id2;
	}
	
}
		
