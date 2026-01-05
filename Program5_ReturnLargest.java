package day5;

public class Program5_ReturnLargest {
	static int largest(int arr[])
		{
			int max=arr[0];
			for (int i=0;i <=arr.length-1;i++)
				if(arr[i]> max)
				{
					max=arr[i];
				}
				
			return max;
				
		}
		
		public static void main(String[] args)
		{
			int arr[]= {10, 45,3,99,25};
			int result=largest(arr);
				System.out.println(result);

		}
	}



