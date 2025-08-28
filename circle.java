import java.util.*;

class circle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter radius of circle:");
        double r = scanner.nextDouble();  // allow decimal input
        
        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        
        System.out.println("Perimeter of circle is: " + perimeter);
        System.out.println("Area of circle is: " + area);
        
        scanner.close(); // close scanner
    }
}
