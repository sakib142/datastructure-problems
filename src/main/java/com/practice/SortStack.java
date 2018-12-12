package com.practice;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
		input.add(34);
		input.add(3);
		input.add(31);
		input.add(98);
		input.add(92);
		input.add(23);

		Stack<Integer> stackVal = sort(input);
		while (!stackVal.isEmpty()) {
			System.out.println(stackVal.pop());
		}
	}

	private static Stack<Integer> sort(Stack<Integer> input) {

		Stack<Integer> tmpStack = new Stack<>();

		while (!input.isEmpty()) {

			int stackElement = input.pop();
			while (!tmpStack.isEmpty() && tmpStack.peek() > stackElement) {
				input.push(tmpStack.pop());
			}
			tmpStack.push(stackElement);
		}

		return tmpStack;
	}

}
