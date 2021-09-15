import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap number1: ");
		int number1 = scan.nextInt();
		System.out.println("Nhap number2: ");
		int number2 = scan.nextInt();
		if (number1 >= number2 ) {
			System.out.println("Key: " + (number1 - number2));
		}
		else {
			System.out.println("Key: " + (number2 - number1));
		}
		System.out.println("Correct");
	}

}
