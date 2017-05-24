package com.lxy.linklist;

/**
 * Created by coldxiangyu on 2017/5/24.
 */
public interface LinearList {

    public boolean isEmpty();  //线性表是否为空

    public int size();   //线性表大小

    public Object get(int index);

    public void set(int index, Object element);

    public boolean add(Object element);     //尾部添加元素

    public boolean add(int index, Object element);      //指定位置添加元素

    public Object remove(int index);

    public void clear();  //清空线性表
}
