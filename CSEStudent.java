public class CSEStudent extends Students{
	int semester;
	String project;
	
	public CSEStudent(int year1 , String course1, int rollno1 , int semester, String project){
		super(year1, course1, rollno1);
		this.semester = semester;
		this.project = project;
	}
	
	public String getunique_id(int year){
		String unique_id1= super.getunique_id(year);
		System.out.println(unique_id1);
		System.out.println("From the child class-");
		String unique_id2= course + roll_no + admissions;
		return unique_id2;
	}
	
}

