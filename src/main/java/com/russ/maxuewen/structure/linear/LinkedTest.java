package com.russ.maxuewen.structure.linear;

/**
 * Created by MaXuewen on 2017/9/8.
 */
public class LinkedTest {
  public static void main(String[] args) {
    Linked<String> linked = new Linked<>();
    linked.add("first1");
    linked.add("first2");
    linked.add("first3");
    System.out.println(linked.size());
    System.out.println(linked.get(2));
    System.out.println(linked.get(0));

//    System.out.println(linked.get(0).getBytes());
  }
}
