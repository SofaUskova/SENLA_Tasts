import java.util.Scanner;

/* ��������� ������� ����� � ���������� ������� �� ������ */
public class DeleteNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a line: ");
		String text = in.nextLine();
		in.close();
	
		String resultWithUndueSpa�e = text.replaceAll("\\d", "");
		String readyText = resultWithUndueSpa�e.replaceAll("[\\s]{2,}", " ");

		System.out.println(readyText);
	}

}
