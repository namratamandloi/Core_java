package in.co.Basics;

public class TestLinearSearch {
	public static void main(String[] args)
	{
		int numbers[]= {1,5,6,9,101,202,100};
		int key = 9;
		int index = search(numbers,key);
		if(index == 0)
		{
			System.out.println("Key is not found in array" +key);
		}
		else
		{
			System.out.println("Key is found in array");
		}
	}

	public static int search(int[] numbers, int key) {
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i] == key)
			{
				return i;
			}
		}
		
		return 0;
	}

}
