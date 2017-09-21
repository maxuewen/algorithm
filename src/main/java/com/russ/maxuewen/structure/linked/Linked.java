package com.russ.maxuewen.structure.linked;

/**
 * 定义:是一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，而是在每一个节点里存到下一个
 *  节点的指针(Pointer)。由于不必须按顺序存储，链表在插入的时候可以达到O(1)的复杂度，比另一种线性表顺序表快得
 *  多，但是查找一个节点或者访问特定编号的节点则需要O(n)的时间，而顺序表相应的时间复杂度分别是O(logn)和O(1)。
 *
 * Created by MaXuewen on 2017/9/19.
 */
public interface Linked<T> {
  T get(int index);

  boolean add(T entity);

  boolean delete(int index);

  int size();
}
