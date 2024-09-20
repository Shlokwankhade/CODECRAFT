import java.util.Stack;

public class ReverseStack {

    // Function to reverse the stack using recursion
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        
        // Remove the top element
        int top = stack.pop();
        
        // Reverse the remaining stack
        reverseStack(stack);
        
        // Insert the removed element at the bottom
        insertAtBottom(stack, top);
    }

    // Helper function to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        
        // Hold all items in Function Call Stack until we reach the bottom
        int top = stack.pop();
        insertAtBottom(stack, value);
        
        // Push the held items back
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Original Stack: " + stack);
        
        reverseStack(stack);
        
        System.out.println("Reversed Stack: " + stack);
    }
}
