package programs;

public class dog {
	String name;
	String color;
	public dog(String name,String color) {
		this.name = name;
		this.color = color;
	}
	public static void main(String[]args) {
		dog myDog = new dog("Layla","white");
		System.out.println(myDog.name);
		System.out.println(myDog.color);
	}
	
}
