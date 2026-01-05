package day5;

public class Program4_SumOfArrays {
	static int sum(int arr[])
	{
		int total=0;
		for (int i=0;i <=arr.length-1;i++)
		{
			total=total+arr[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		int arr[]= {100,200,300,400,500};
		int result=sum(arr);
			System.out.println(result);
	}
}
	
	/*{
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        return temp;
    }

	public static void main(String[] args) {
		int arr[]= {100,200,300,400,500};
		
			System.out.println(sum(arr));

	}*/


