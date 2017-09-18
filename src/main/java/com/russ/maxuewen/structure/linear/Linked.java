package com.russ.maxuewen.structure.linear;

/**
 * Created by MaXuewen on 2017/9/8.
 */
public class Linked<T> {

  private LinkBody<T> link;
  private int size = 0;

  public Linked() {
    link = new LinkBody<>();
    LinkBody var1 = new LinkBody();
    link.setNext(var1);
    var1.setNext(null);
  }

  public void add(T content) {
    LinkBody var1 = new LinkBody();
    var1.setBody(content);
//    var1.setNext(link.getNext());
//    link.setNext(var1);
    if (size == 0){
      link.setNext(var1);
    }else {
      getBody(size-1).setNext(var1);
    }
    size ++;
  }

  public void add(int i, T content) {
    LinkBody<T> var1 = new LinkBody();
    var1.setBody(content);
    var1.setNext(getBody(i));
    if (i - 1 != 0) {
      getBody(i -1).setNext(var1);
    } else{
      link.setNext(var1);
    }
  }

  public boolean delete(int i) {
    if (i > size || i < 0) return false;

    if (size == 0) {
      return false;
    }else if (size == 1) {
      link.setNext(new LinkBody());
    }else {
      if (i - 1 == 0) {
        link.setNext(getBody(i + 1));
      }else if (i + 1 == size) {
        getBody(i -1).setNext(new LinkBody());
      }
    }
    size--;
   return true;
  }

  public T get(int i) {
    return getBody(i-1).getBody();
  }

  private LinkBody<T> getBody(int i) {
    if (i > size) throw new IndexOutOfBoundsException("");
    LinkBody<T> temp = link;
    for (int x = 0; x <= i; x++) {
      temp = temp.getNext();
    }
    return temp;
  }

  public int size(){
    return size;
  }

  //链表体
  public static class LinkBody<T> {
    private LinkBody next = null;
//    public LinkBody privious;
    private T body = null;

    public LinkBody getNext() {
      return next;
    }

    public void setNext(LinkBody next) {
      this.next = next;
    }

    public T getBody() {
      return body;
    }

    public void setBody(T body) {
      this.body = body;
    }
  }
}
