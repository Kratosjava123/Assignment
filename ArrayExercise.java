import org.apache.connons.lang3.stringUtils;

import org.json.JSONObject;

public class ArrayExercise{

// array of strings
public static void main(String[] args){
	String s1[]={"Hello","world"};
	int 1,1;
	for(i=0;i<s1[i].length();i++){
		System.out.println(s1[1].charAt(i));
	}
}
//concatination of 2 strings
String s6="Hello";
String s9="";
String s7="World";
String s8=s6.concat(s7);
System.out.println("Concatinated string is "+s8);

JSONOnject j1=new JSONObject();
j1.put("Name","Nikhil");
j1.put("Year","3rd");
j1.put("College","SRM");
System.out.println(j1.toString());
System.out.println("The value of the key name in j1 ="+j1.get("Name"));
System.out.println(StringUtils.equals("Name","College"));
//System.out.println(StringUtils.equals());
