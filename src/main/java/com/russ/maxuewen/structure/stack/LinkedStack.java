package com.russ.maxuewen.structure.stack;

import com.russ.maxuewen.structure.linked.Linked;
import com.russ.maxuewen.structure.linked.SingleLinked;

/**
 * 用链表实现
 *
 * Created by MaXuewen on 2017/9/21.
 */
public class LinkedStack<T> extends IStack<T> {

  Linked elementData;

  public LinkedStack() {
    this.elementData = new SingleLinked<T>();
  }

  @Override
  boolean push(T entity) {
    if (elementData.add(entity)) {
      current_SIZE ++;
      return true;
    }else {
      return false;
    }
  }

  @Override
  T pop() {
    T t = (T) elementData.get(current_SIZE - 1);
    elementData.delete(current_SIZE - 1);
    current_SIZE --;
    return t;
  }

  @Override
  T peek() {
    return (T) elementData.get(current_SIZE - 1);
  }
}
