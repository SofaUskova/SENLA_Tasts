import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* программа вычисл€ет простые числа в пределах от 1
до N. N вводитс€ вручную.
–ешето Ёратосфена*/
public class SimpleNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int number = in.nextInt();
		in.close();
		
		boolean[] allNumbers = new boolean[number + 1];
		Arrays.fill(allNumbers, true);
		
		sieveOfEratosthenes(allNumbers);
	}

	private static void sieveOfEratosthenes(boolean[] allNumbers) {
		ArrayList<Integer> simpleNumbers = new ArrayList<Integer>();
		allNumbers[1] = false;
		for (int i = 2; i < allNumbers.length; ++i) {
			if (allNumbers[i]) {
				simpleNumbers.add(i);
				for (int j = 2; i * j < allNumbers.length; ++j) {
					allNumbers[i * j] = false;
				}
			}
		}
		for (int i = 0; i < simpleNumbers.size(); i++) {
			System.out.println(simpleNumbers.get(i));
		}
	}
}
