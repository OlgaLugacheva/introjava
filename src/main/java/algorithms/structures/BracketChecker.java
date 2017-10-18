package algorithms.structures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketChecker {
	private String input; //входная строка

	///конструктор
	public BracketChecker(String input) {
		this.input = input;
	}

	/**
	 * сама функция проверки на наличие закрывающихся пар скобок
	 */
	public void check() {
		int stackSize = input.length();//определение размера стека
		StackByArr theStack = new StackByArr(stackSize); // Создание стека
		for (int j = 0; j < input.length(); j++) // Последовательное чтение
		{
			char ch = input.charAt(j); // Чтение символа
			switch (ch) {
				case '{': // Открывающие скобки
				case '[':
				case '(':
					theStack.push(ch); // Занести в стек
					break;
				case '}': // Закрывающие скобки
				case ']':
				case ')':
					if (!theStack.isEmpty()) // Если стек не пуст,
					{
						char chx = theStack.pop(); // Извлечь и проверить
						if ((ch == '}' && chx != '{') ||
								(ch == ']' && chx != '[') ||
								(ch == ')' && chx != '('))
							System.out.println("Error: " + ch + " at " + j);
					} else // Преждевременная нехватка элементов
						System.out.println("Error: " + ch + " at " + j);
					break;
				default: // Для других символов действия не выполняются
					break;
			}
		}
// В этой точке обработаны все символы
		if (!theStack.isEmpty())
			System.out.println("Error: missing right delimiter");
	}//--------------------------------------------------------------

}

class BracketsApp
{
	public static void main(String[] args) throws IOException
	{
		String input ;
		while(true)
		{
			System.out.print(
					"Enter string containing delimiters: ");
			System.out.flush();
			input = getString(); // Чтение строки с клавиатуры
			if( input.equals("") ) // Завершение, если [Enter]
				break;
// Создание объекта BracketChecker
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check(); // Проверка парных скобок
		}
	}
	//--------------------------------------------------------------
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
//--------------------------------------------------------------
} // Конец класса BracketsApp
////////////////////////////////////////////////////////////////
