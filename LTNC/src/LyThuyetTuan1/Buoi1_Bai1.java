package LyThuyetTuan1;

public class Buoi1_Bai1 {
public static char[] arrChar(String str) {
		
		char[] arrChar = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arrChar[i] = str.charAt(i);
		}
		return arrChar;
	}

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello1";
		String s3 = "Hello11";
		String s4 = "Hello111";
		String s5 = "Hello1111";
		
		System.out.println(arrChar(s1));
		System.out.println(arrChar(s2));
		System.out.println(arrChar(s3));
		System.out.println(arrChar(s4));
		System.out.println(arrChar(s5));
	}

}
