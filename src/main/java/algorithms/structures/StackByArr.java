package algorithms.structures;

public class StackByArr {
	private int maxSize;
	private char[] stackArray;
	private int top;

	//--------------------------------------------------------------
	public StackByArr(int s) // Конструктор
	{
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	//--------------------------------------------------------------
	public void push(char j) // Размещение элемента на вершине стека
	{
		stackArray[++top] = j;
	}
	//--------------------------------------------------------------
	public char pop() // Извлечение элемента с вершины стека
	{
		return stackArray[top--];
	}
	//--------------------------------------------------------------
	public char peek() // Чтение элемента с вершины стека
	{
		return stackArray[top];
	}
	//--------------------------------------------------------------
	public boolean isEmpty() // True, если стек пуст
	{
		return (top == -1);
	}
//--------------------------------------------------------------
}
