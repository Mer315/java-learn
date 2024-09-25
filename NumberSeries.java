package sumedha_practice;
public class NumberSeries {
    public static void main(String[] args) {
        // Print number series
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();  // Move to the next line
        }
    }
}