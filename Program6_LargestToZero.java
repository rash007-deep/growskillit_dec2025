package day5;

public class Program6_LargestToZero {
	static void fun(int arr[])
	{
		int max=arr[0];   //find the largest value
		int index=0;    //track its index
		for (int i=0;i <=arr.length-1;i++)
			if(arr[i]> max)
			{
				max=arr[i];
				index = i;
			}
			
		arr[index] = 0;    //Replace it with 0
			
	}
	
	public static void main(String[] args)
	{
		int arr[]= {10, 45,3,99,25};
		fun(arr);
		for(int i :arr)
			System.out.println(i + "");

	}

}
