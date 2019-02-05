import java.util.Scanner;

/* программа, считающая числа Фибоначчи в пределах
от 1 до N, где N вводиться вручную */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a count number Fibonacci: ");
		int countNumberFibonacci = in.nextInt();
		in.close();
		
		for (int i = 0; i < countNumberFibonacci; i++)
			System.out.println(fibonacciNumbers(i));
	}

	public static int fibonacciNumbers(int i) {
		if (i == 0)
			return 0;
		else if (i == 1)
			return 1;
		else
			return fibonacciNumbers(i - 2) + fibonacciNumbers(i - 1);
	}
}
