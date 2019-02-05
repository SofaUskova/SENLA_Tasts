import java.util.Scanner;

/* поиск палиндрома */
public class Palindromic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a line to check for the palindromic: ");
		String str = in.nextLine();
		in.close();
		
		str = str.replaceAll(" ", "");

		StringBuffer sbf = new StringBuffer(str);
		String str2 = sbf.reverse().toString();

		if (str.equalsIgnoreCase(str2))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}

}
