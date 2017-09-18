package com.russ.maxuewen.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by MaXuewen on 2017/9/5.
 *
 * http://www.jianshu.com/p/5b800057f2d8
 */
public class Lambda {

  public static String message;

  public static void main(String[] args) {
    List<String> strings = Arrays.asList("1", "2", "3");
    strings.stream().forEach(Lambda::a);

    collide(Lambda::new);
  }

  public static void a(String a) {
    System.out.println(a);
  }

  public static void collide(Supplier<Lambda> supplier) {
    System.out.println(supplier.get());
  }
}
