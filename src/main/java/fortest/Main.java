package fortest;

import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		System.out.println(IntStream.of(1, 2, 3).map(x -> x * x).sum());
		//System.out.println(fib(3));
		int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(a[1][2] + a [0][0]);
		System.out.println(f(6));;
		System.out.println(3 | 4);
		Node node = new Node();

	}

	static int fib(int n) {
		return fib(n - 1) + fib(n - 2);
	}

	static int f(int n) {
		if (n <= 0) {
			return 0;
		}
		return n + f(n / 2);
	}


	static class Node {
		Node left;
		Node right;

		static int height(Node node) {
			if (node == null) {
				return 0;
			}

			int left = height(node.left);
			int right = height(node.right);
			return Math.max(left, right);
		}


	}




}
