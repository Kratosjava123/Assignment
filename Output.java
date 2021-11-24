// To print different messages for different year admission using Students class
public class Output{
	public static void main(String args[]){
	    System.out.println("Student Info");
	    
	    Students s1 = new CSEStudent(2019, "CSE", 123, 4, "Java Course");
	    //Students s2 = new Students(2007, "ECE", 27);
	    
	    String id1 = s1.getunique_id(2019);
	    System.out.println ("Unique ID for admission from  of after 2019-"+ id1);
	    
	    boolean isECEType = s1 instanceof CSEStudent;
	    System.out.println(isECEType);
	 
	 CollegeGoer s2 = new ECEStudent(2019,"ECE",27,3,12.2f);
	 CollegeGoer s3 = new Facilty();
	 
	 String id2 = s2.getUniqueId(2019)
	 System.out.println("Unique ID for admission after 2018 using ECE student class -"+id2);
	 String id3 = s3.getUniqueId(2020);
	 System.out.println("Unique ID for admission after 2018 using Faculty class -"+id3);
	 
	}
}
