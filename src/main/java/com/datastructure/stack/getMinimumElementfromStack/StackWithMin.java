package com.datastructure.stack.getMinimumElementfromStack;

import java.util.Stack;

public class StackWithMin {

	private Stack<Integer> normalstk = new Stack<Integer>();
	private Stack<Integer> minstk = new Stack<Integer>();

	// while pushing into
	// Push into minstk if inserted element is smaller than smallest input element
	// or if minstk is empty
	//
	public void push(int input) {
		if (minstk.isEmpty() || (input < minstk.peek()))
			minstk.push(input);
		// push into normal stk anyways
		normalstk.push(input);
	}

	// while popping if element is =minstk.top then pop from minstk too
	public int pop() {
		if (normalstk.isEmpty())
			return -1; // stk is empty
		int ret = normalstk.pop();
		if (ret == minstk.peek())
			minstk.pop();// pop from minstk as well!
		return ret;
	}

	// get the minimum at any point
	public int getMin() {
		if (minstk.isEmpty())
			return -1;
		return minstk.pop();
	}

}
