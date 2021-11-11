public class GenericStackClient {
	private static void stackOfString() {
		MyGenericStack<String> stack = new MyGenericStack<>();
		stack.push("Five");
		stack.push("Four");
		stack.push("Three");
		stack.push("Two");
		stack.push("One");
		System.out.printf("2.1 Size of stack after push operations: %d.%n", stack.size());
		System.out.printf("2.2 Pop element from stack :%n");
		while (!stack.isEmpty()) {
			System.out.printf(" %s%n", stack.pop());
		}
		System.out.printf("2.3 Size of stack after pop operations: %d.", stack.size());
	}
	
	private static void stackOfIntegers() {
		MyGenericStack<Integer> stack = new MyGenericStack<>();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.printf("1.1 Size of stack after push operations: %d.%n", stack.size());
		System.out.printf("1.2 Pop element from stack: %n");
		while (!stack.isEmpty()) {
			System.out.printf("%d%n", stack.pop());
		}
		System.out.printf("1.3 Size of stack after pop operations: %d.%n", stack.size());
	}
	
	public static void main(String[] args) {
		System.out.printf("1. Stack of integers%n");
		stackOfIntegers();
		System.out.printf("%n2. Stack of Strings%n");
		stackOfString();
	}
}
