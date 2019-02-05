import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* программа, считывающа€ четыре логических значени€ и
печатающа€ УTrueФ в том случае, если ровно два из них истинны. 
«начени€ ввод€тс€ вручную, дл€ получени€ результата
введите любой символ*/
public class True {

	public static void main(String[] args) {
		List<Boolean> array = new ArrayList<Boolean>();

		Scanner in = new Scanner(System.in);
		System.out.print("Enter an array, enter any character to get the result: ");

		do {
			array.add(in.nextBoolean());
		} while (in.hasNextBoolean());

		in.close();

		int count = 0;
		for (int i = 0; i < array.size(); ++i) {

			if (array.get(i))
				count++;

			if ((i + 1) % 4 == 0 && i != 0) {
				if (count == 2)
					System.out.println("True");
				else
					System.out.println("False");
				count = 0;
			}
		}
	}
}
