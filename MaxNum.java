package Demo;
import java.util.Scanner;
public class MaxNum {
	public static void main(String[] args) {
		System.out.println("Please Enter 3 Numbers : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System. out. println("The Largest Number is :"+d);

	}

	}

