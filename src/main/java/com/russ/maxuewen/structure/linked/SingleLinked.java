package com.russ.maxuewen.structure.linked;

/**
 * 定义: 包含两个域，一个信息域和一个指针域。这个链接指向列表中的下一个节点，而最后一个节点则指向一个空值。
 *
 * Created by MaXuewen on 2017/9/20.
 */
public class SingleLinked<T> implements Linked<T> {

  //第一个节点
  Node<T> first;

  //最后一个节点,为了快速在尾部添加元素
  Node<T> last;

  //总长度
  int size = 0;

  public SingleLinked() {
    this.first = new Node<>(null,null);
    this.last = first;
  }

  @Override
  public T get(int index) {
    if (index < 0 || index > size) return null;
    Node node = first.next;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return (T) node.data;
  }

  @Override
  public boolean add(T entity) {
    Node<T> node = new Node<>(entity,null);
    this.last.next = node;
    this.last = node;
    size++;
    return true;
  }

  @Override
  public boolean delete(int index) {
    if (index < 0 || index > size) return false;
    if (index == 0) {
      first.next = first.next.next;
      size--;
      return true;
    }
    Node node = first;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    node.next = node.next.next;
    size--;
    return true;
  }

  @Override
  public int size() {
    return size;
  }

  /**
   * 节点定义
   * @param <T>
   */
  public static class Node<T> {
    T data;
    Node<T> next;

    public Node(T data, Node<T> next) {
      this.data = data;
      this.next = next;
    }
  }
}
