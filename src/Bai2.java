import java.util.Scanner;
import java.lang.Math;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.println("Your weight is kilograms: ");
    float weight = scan.nextFloat();
    System.out.println("Your height is met: ");
    float height = scan.nextFloat();
    float BMI = weight / (height*height);
    if (BMI < 18.5) {
		System.out.println("Underweight");
	}
    else if (BMI < 25.0 ) {
		System.out.println("Normal");
	}
    else if (BMI < 30 ) {
		System.out.println("Overweight");
	}
    else {
		System.out.println("Obese");
	}
	}

}
