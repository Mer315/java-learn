package programs;

public class computer {
	public class processor{
		String brand;
		String speed;
		public void displayDetails(String brand, String speed){
			System.out.println(brand);
			System.out.println(speed);
		}
	}

	public static void main(String[]args) {
		computer c = new computer();
		processor p = c.new processor();
		p.displayDetails("DELL","8GB");
		
	}
}


