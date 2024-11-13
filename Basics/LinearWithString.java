package in.co.Basics;

public class LinearWithString {
	public static void main(String[] args)
	{
		String menu[]= {"momos","kachori","noodles","jalebi"};
		String key = "noodles";
		int index = search(menu,key);
		if(index == -1)
		{
			System.out.println("Item is not found in menu =" +key);
		}
		else
		{
			System.out.println("Item is found in menu =" +key);
		}
	}

	public static int search(String[] menu, String key) {
		for(int i=0; i<menu.length; i++)
		{
			if(menu[i] == key)
			{
				return i;
			}
		}
		
		return 0;
	}


}
