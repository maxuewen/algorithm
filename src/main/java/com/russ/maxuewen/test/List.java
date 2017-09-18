package com.russ.maxuewen.test;

import java.util.LinkedList;

/**
 * Created by MaXuewen on 2017/9/8.
 */
public class List {
  public static void main(String[] args) {
    LinkedList<String> var1 = new LinkedList();
    var1.add("a");
    var1.add(1,"aa");
//    var1.addFirst("aaa");
    var1.addLast("aaa");
//    var1.
    System.out.println(var1.get(0));
  }
}
