package com.russ.maxuewen.structure.linked;

/**
 * Created by MaXuewen on 2017/9/8.
 */
public class Test {
  public static void main(String[] args) {
//    Linked<String> linked = new SingleLinked<>();
    Linked<String> linked = new DoubleLinked<>();
    linked.add("first1");
    linked.add("first2");
    linked.add("first3");
    foreach(linked);
//    System.out.println(linked.get(3));

    linked.delete(0);
    foreach(linked);
  }

  private static void foreach(Linked linked) {
    System.out.println("链表遍历");
    for (int i = 0; i < linked.size(); i++) {
      System.out.println(linked.get(i));
    }
  }
}
