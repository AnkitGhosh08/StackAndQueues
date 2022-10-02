package com.codinclub;

/**
 *  Main method for the stack
 *  We are creating object of the service class and calling its function
 *
 */
public class StackMain {
    public static void main(String[] args) {
        StackServices stack = new StackServices();
        System.out.println("Elements in the stack are : ");
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.display();
    }
}
