package test;

public class FirstTry {

	public static void main(String[] args) {

	}
	
	static int max(int[] arr)
	{
		int temp = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(temp < arr[i])
			temp = arr[i];
		}
		return temp;
	}
	
	static int min(int[] arr)
		{
			int temp = arr[0];
			for(int i = 1; i < arr.length; i++)
			{
				if(temp > arr[i])
				temp = arr[i];
			}
			return temp;
		}
}
