package com.lxy.linklist;

/**
 * Created by coldxiangyu on 2017/5/24.
 */
public class TestDemo {
    public static void main(String[] args){
        SequenceList slist = new SequenceList(3);
        System.out.println("is Empty?  "+slist.isEmpty());
        slist.add("xiang");
        slist.add("yu");
        slist.add(0, "cold");
        slist.add("!!!");
        slist.remove(3);
        System.out.println("is Empty?  "+slist.isEmpty());
        System.out.println(slist.get(0));
        System.out.println(slist.get(1));
        System.out.println(slist.get(2));
       // System.out.println(slist.get(3));
       // System.out.println(slist.get(4));
        System.out.println("is Empty?  "+slist.isEmpty());
    }
}
