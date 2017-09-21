package com.russ.maxuewen.structure.stack;

/**
 * 定义:栈是限定仅在表头进行插入和删除操作的线性表。要搞清楚这个概念，首先要明白”栈“原来的意思，如此才能
 *  把握本质。"栈“者,存储货物或供旅客住宿的地方,可引申为仓库、中转站，所以引入到计算机领域里，就是指数据暂
 *  时存储的地方，所以才有进栈、出栈的说法。
 *
 * Created by MaXuewen on 2017/9/19.
 */
public abstract class IStack<T> {

  int current_SIZE = 0;

  abstract boolean push(T entity);
  abstract T pop();
  abstract T peek();

  protected boolean empty() {
    return current_SIZE == 0;
  }
}
