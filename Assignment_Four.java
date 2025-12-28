package assignments;

import java.util.Scanner;

public class Assignment_Four {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
        //int a=2;
        //int b=7;
		int num1 = input.nextInt();
        int num2 = input.nextInt();
				if(num1<num2)
        			System.out.println("num  "+  num1 );
        		else
        			System.out.println("num  "+  num2 );
				 input.close();
	}

}
