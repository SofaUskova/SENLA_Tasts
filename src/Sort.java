import java.util.Arrays;
import java.util.Scanner;

/* быстра сортировка, массив вводится вручную */
public class Sort {

	public static void main(String[] args) {
		int low = 0;
		int mas[] = new int[10];
		System.out.print("Enter ten numbers: ");
		
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			mas[i] = in.nextInt();
		}
		in.close();
		
		int high = mas.length - 1;

		System.out.print("Before: ");
		System.out.println(Arrays.toString(mas));

		quickSort(mas, low, high);
		System.out.print("After: ");
		System.out.println(Arrays.toString(mas));
	}

	public static void quickSort(int[] array, int low, int high) {

		if (array.length == 0)
			return;

		if (low >= high)
			return;

		int middle = low + (high - low) / 2;
		int opora = array[middle];

		int i = low, j = high;
		while (i <= j) {
			while (array[i] > opora)
				i++;

			while (array[j] < opora)
				j--;

			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}

		if (low < j)
			quickSort(array, low, j);

		if (high > i)
			quickSort(array, i, high);
	}
}
