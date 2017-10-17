package algorithms;

import java.util.Scanner;

public class decompose {
//Выведите разложение натурального числа n > 1 на
// простые множители. Простые множители должны
// быть упорядочены по возрастанию и разделены пробелами.

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String b = " ";
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i);
				n = n / i;
				i--;
				if (n == 1) {
					b = "";
					break;
				} else System.out.print(b);
			}
		}
	}

}
