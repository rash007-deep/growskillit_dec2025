package assignments;

import java.util.Scanner;

public class Assignment_Six {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int marks = input.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("A");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("B");
        } else if (marks >= 50 && marks <= 74) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }

        input.close();

	}

}
