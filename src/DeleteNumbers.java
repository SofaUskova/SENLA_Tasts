import java.util.Scanner;

/* программа убирает цифры и избыточные пробелы из текста */
public class DeleteNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a line: ");
		String text = in.nextLine();
		in.close();
	
		String resultWithUndueSpaсe = text.replaceAll("\\d", "");
		String readyText = resultWithUndueSpaсe.replaceAll("[\\s]{2,}", " ");

		System.out.println(readyText);
	}

}
