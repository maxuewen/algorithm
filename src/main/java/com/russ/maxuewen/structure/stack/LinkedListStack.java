package com.russ.maxuewen.structure.stack;

import java.util.LinkedList;
import java.util.List;

/**
 * 用java的LinkedList实现
 * Created by MaXuewen on 2017/9/19.
 */
public class LinkedListStack<T> extends IStack<T> {

  List<Object> elementData;

  public LinkedListStack() {
    this.elementData = new LinkedList<>();
  }

  @Override
  public boolean push(T entity) {
    current_SIZE++;
    return elementData.add(entity);
  }

  @Override
  public T pop() {
    return current_SIZE > 0 ? (T)elementData.get(--current_SIZE) : null;
  }

  @Override
  public T peek() {
    return current_SIZE > 0 ? (T)elementData.get(current_SIZE - 1) : null;
  }
}
