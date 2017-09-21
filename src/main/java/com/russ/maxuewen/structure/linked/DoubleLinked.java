package com.russ.maxuewen.structure.linked;

/**
 * 定义：每个节点有两个连接：一个指向前一个节点，（当此“连接”为第一个“连接”时，指向空值或者空列表);
 *  而另一个指向下一个节点，（当此“连接”为最后一个“连接”时，指向空值或者空列表）
 *
 * Created by MaXuewen on 2017/9/20.
 */
public class DoubleLinked<T> implements Linked<T> {

  Node first;

  Node last;

  int size;

  public DoubleLinked() {
    this.first = new Node(null,null, null);
    this.last = new Node(null,null, null);
    this.first.next = last;
    this.last.prev = first;
  }

  @Override
  public T get(int index) {
    if (index > size || index < 0) return null;
    Node node;
    // size >> 1 近似等于size的一般
    if (index > size >> 1) {
      node = last.prev;
      for (int i = 0; i < (size - index - 1); i ++) {
        node = node.prev;
      }
    }else {
      node = first.next;
      for (int i = 0; i < index; i ++) {
        node = node.next;
      }
    }
    return (T) node.data;
  }

  @Override
  public boolean add(T entity) {
    Node node = new Node(entity, last.prev, last);
    this.last.prev.next = node;
    this.last.prev = node;
    size ++;
    return true;
  }

  /**
   * 先找到要删除的节点，然后做删除操作
   * @param index
   * @return
   */
  @Override
  public boolean delete(int index) {
    if (index > size || index < 0) return false;
    Node node;
    if (index > size >> 1) {
      node = last.prev;
      for (int i = 0; i < (size - index - 1); i ++) {
        node = node.prev;
      }
    }else {
      node = first.next;
      for (int i = 0; i < index; i ++) {
        node = node.next;
      }
    }
    node.prev.next = node.next;
    size --;
    return true;
  }

  @Override
  public int size() {
    return size;
  }

  private static class Node<T> {
    Node prev;
    Node next;
    T data;

    public Node(T data, Node prev, Node next) {
      this.data = data;
      this.prev = prev;
      this.next = next;
    }
  }
}
