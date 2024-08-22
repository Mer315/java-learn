package programs;

public class methodoverload {
	public int method(int x) {
		return x;
	}
	public double method(double y) {
		return y;
	}
	public int method(int x,int y) {
		return x+y;
	}
	public static void main(String[]args) {
		methodoverload obj = new methodoverload();
		System.out.println(obj.method(12));
		System.out.println(obj.method(12.5));
		System.out.println(obj.method(12+13));
	}
	
}
