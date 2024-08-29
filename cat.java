package programs;

public class cat {
	String name;
	int age;
	public cat(){
		this.name = "unknown";
		this.age = 0;
	}
	public static void main(String[]args) {
		cat myCat = new cat();
		System.out.println(myCat.name);
		System.out.println(myCat.age);
		
	}

}
