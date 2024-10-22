package in.co.Basics;

public class StringLength {
	public static void main(String[] args)
	{
		String name="Namrata Singh Mandloi";
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf("Namrata"));
		System.out.println(name.indexOf("i"));
		System.out.println(name.lastIndexOf("i"));
		System.out.println(name.replace("a", "b"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Namrata"));
		System.out.println(name.endsWith("loi"));
		System.out.println(name.substring(6));
	}

}
