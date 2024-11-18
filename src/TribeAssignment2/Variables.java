package TribeAssignment2;

public class Variables {
	String Name;
	int age;
	String stdId;
	static String nationality;
	
	
		
		
	
public static void main(String[] args) {
	int s1 = 10;
	String str = "Mounika";
	float s2 = 58.0f;
	System.out.println(s1+" " + str+" "+ s2);
	Variables v1 = new Variables();
	v1.Name = "Madhuri";
	v1.age = 22;
	v1.stdId = "23E";
	v1.nationality ="Indian";
	System.out.println(v1.Name+" "+v1.age+" "+v1.stdId+" "+v1.nationality);
	
	
	AnotherClass.myName();
	AnotherClass obj1 = new AnotherClass();
	System.out.println(obj1.myNumber());
	
			
	
}

}


class AnotherClass{
	
	public int myNumber() {//instance method
		int n=10+20;
		return n;
	
}
	public static void myName() {//static method
		System.out.println("Krishna Jonna");
	}
}