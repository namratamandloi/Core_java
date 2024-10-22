package in.co.Basics;

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Namrata");
		sb.append(" Singh Mandloi");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(1));
		System.out.println(sb.indexOf("Singh Mandloi"));
		System.out.println(sb.replace(0, 5, "rata"));
		System.out.println(sb.reverse());
	}

}
