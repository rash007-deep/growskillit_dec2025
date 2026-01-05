package day5;

public class Program1_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		for(int i=0;i<=arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		int arr1[]=new int[3];
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		for(int i=0;i<=arr1.length-1;i++)
			System.out.print(arr1[i]+" ");
	}

}
