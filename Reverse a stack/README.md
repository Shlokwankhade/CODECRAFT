# Reverse Stack in Java

This is a Java project that demonstrates how to reverse the elements of a stack using only stack operations (`push` and `pop`). The solution avoids using any additional data structures and implements the reversal through recursion.

## Problem Statement

You are given a stack of integers. Your task is to reverse the order of the elements in the stack using only stack operations (push and pop) and without using any additional data structures.

### Example:
- **Input**: `stack = [1, 2, 3, 4, 5]`
- **Output**: `stack = [5, 4, 3, 2, 1]`

## Solution Explanation

This project contains a Java program that solves the problem using recursion. The key idea is to pop each element from the stack, reverse the remaining stack, and then insert the popped element back at the bottom of the reversed stack.

The code contains two main functions:

1. `reverseStack`: This function reverses the entire stack by popping the top element, recursively reversing the remaining elements, and then placing the popped element at the bottom of the stack.

2. `insertAtBottom`: This helper function takes an element and inserts it at the bottom of the stack. It recursively pops elements until the stack is empty, pushes the new element, and then restores the popped elements.

## How to Run the Project

### Prerequisites
- Java Development Kit (JDK) installed
- Visual Studio Code (VS Code) or any other Java IDE

### Instructions

1. Clone or download the project files.

2. Open the project folder in VS Code or your preferred Java IDE.

3. Copy the `ReverseStack.java` file into your working directory.

4. Compile the Java program:
   ```bash
   javac ReverseStack.java
