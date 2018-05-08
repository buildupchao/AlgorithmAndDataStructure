package zychaowill.datastructure.research;

import java.util.Stack;

import zychaowill.datastructure.research.utils.PrintlnUtils;

public class SortStackBasedOnAnotherStackExample {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(4);
		stack.push(532);
		stack.push(6);
		stack.push(0);
		SortStackBasedOnAnotherStack.sort(stack);
		
		PrintlnUtils.sprintln(stack);
	}
}
