package com.russ.maxuewen.structure.stack;

/**
 * Created by MaXuewen on 2017/9/19.
 */
public class Test {
  static ArrayStack arrayStack = new ArrayStack(10);
  static LinkedListStack linkedListStack = new LinkedListStack();
  static LinkedStack linkedStack = new LinkedStack();

  public static void main(String[] args) {
    System.out.println("ArrayStack");
    arrayStack.push(1);
    arrayStack.push(2);
    arrayStack.push(3);
    while (!arrayStack.empty()) {
      System.out.println(arrayStack.pop());
    }

    System.out.println("LinkedListStack");
    linkedListStack.push(1);
    linkedListStack.push(2);
    linkedListStack.push(3);
    while (!linkedListStack.empty()) {
      System.out.println(linkedListStack.pop());
    }

    System.out.println("LinkedStack");
    linkedStack.push(1);
    linkedStack.push(2);
    linkedStack.push(3);
    while (!linkedStack.empty()) {
      System.out.println(linkedStack.pop());
    }
  }
}
