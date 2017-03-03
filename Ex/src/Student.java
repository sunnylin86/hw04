
public class Student {
	private String name, id , tellphone;
	private char gender;
	private float height , weight;
	public void setStudent(String name1 ,String id1){
		name = name1;
		id = id1;
	}
	public void setGender(char gender1){
		gender = gender1;
	}
	public String getName(){
		return name;
	}
	public char getGender(){
		return gender;
	}
	public String getID(){
		return id;
	}
}
