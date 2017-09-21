package com.russ.maxuewen.algorithm.sorting;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * Created by MaXuewen on 2017/9/19.
 */
public class Bubble {
  static int x[] = {1,26,7,8,9,22,44,77,88,4,2,3};
  public static void main(String[] args) {
    sort(x);
    System.out.println(Arrays.toString(x));
  }

  public static void sort(int[] x) {

    for (int i = 0; i < x.length; i++) {
      for (int j = i + 1; j < x.length; j++) {
        if (x[i] > x[j]){
          int var = x[j];
          x[j] = x[i];
          x[i] = var;

        }
      }
    }
  }
}
