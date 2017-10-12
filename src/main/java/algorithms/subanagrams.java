package algorithms;

/*
* Дано две строки. Напишите алгоритм, который выдаст символы,
* присутствующие в обеих строках (например "table and chair" и
* "spoon and fork", нужно вывести: "andr") и
* проанализируйте временную сложность.
* Реализовать алгоритм можно на любом языке программирования
* */
public class subanagrams {


	public static String An(String s1, String s2)
	{
		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceAll(" ", "");

		int[] a1 = new int[26];
		int[] a2 = new int[26];
		for (int i=0; i<s1.length(); i++) {
			char b = s1.charAt(i);
			int pos = Integer.valueOf(b) - Integer.valueOf('a');
			a1[pos] = a1[pos] +1;
		}
		for (int i=0; i<s2.length(); i++) {
			char b = s2.charAt(i);
			int pos = Integer.valueOf(b) - Integer.valueOf('a');
			a2[pos] = a2[pos] +1;
		}
		int j = 0;
		String result= "";
		while ((j< 26) )
		{
			if ((a2[j]!=0) & (a1[j]!=0))
			{
				result+= (char)(j +Integer.valueOf('a'));
			}
			j++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(An("table and chair", "spoon and fork"));
	}
}
