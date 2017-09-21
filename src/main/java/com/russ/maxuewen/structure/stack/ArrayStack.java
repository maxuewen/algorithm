package com.russ.maxuewen.structure.stack;

/**
 * 用数组实现
 * Created by MaXuewen on 2017/9/19.
 */
public class ArrayStack<T> extends IStack<T> {

  int MAX_SIZE = 0;

  private Object[] elementData;

  public ArrayStack(int size) {
    MAX_SIZE = size <= 0 ? 10 : size;
    elementData = new Object[size];
  }

  @Override
  public boolean push(T entity) {
    if (current_SIZE >= MAX_SIZE) {
      expandSpace();
    }
    elementData[current_SIZE] = entity;
    current_SIZE++;
    return true;
  }

  @Override
  public T pop() {
    if (current_SIZE == 0) {
      return null;
    }
    current_SIZE --;
    return (T)elementData[current_SIZE];
  }

  @Override
  public T peek() {
    if (current_SIZE == 0) {
      return null;
    }
    return (T)elementData[current_SIZE - 1];
  }

  /**
   * 满栈后扩容
   * @return
   */
  private boolean expandSpace() {
    Object[] newStack = new Object[MAX_SIZE + MAX_SIZE / 2];
    for (int i = 0; i < elementData.length; i++) {
      newStack[i] = elementData[i];
    }
    elementData = newStack;
    return true;
  }
}
