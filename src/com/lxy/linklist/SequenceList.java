package com.lxy.linklist;

/**
 * Created by coldxiangyu on 2017/5/24.
 * 线性表实现
 */
public class SequenceList implements LinearList {

    private Object[] slist;
    private int size;

    public SequenceList(int length){
        if(length == 0){
            this.slist = new Object[10];
        }
        this.slist = new Object[length];
    }

    public SequenceList(){
        this(10);
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }


    public int size() {
        return size;
    }


    public Object get(int index) {
        checkIndex(index);
        return (Object) slist[index];
    }


    public void set(int index, Object element) {
        checkIndex(index);
        slist[index] = element;
    }


    public boolean add(Object element) {
        return add(size, element);
    }


    public boolean add(int index, Object element) {
        checkIndex(index);
        if(size == index){
            Object[] temp = slist;
            this.slist = new Object[temp.length * 2];
            for(int i = 0; i < temp.length; i++){
                this.slist[i] = temp[i];
            }
        }
        for(int i = size - 1; i >= index; i--){
            slist[i + 1] = slist[i];
        }
        slist[index] = element;
        size++;
        return true;
    }


    public Object remove(int index) {
        checkIndex(index);
        Object remove = (Object) slist[index];
        for(int i = index; i < size; i++){
            slist[i] = slist[i + 1];
        }
        slist[--size] = null;
        return remove;
    }


    public void clear() {
        if(!isEmpty()){
            for(int i = 0; i < size; i++){
                slist[i] = null;
            }
            size = 0;
        }
    }

    public void checkIndex(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index " + index + ", size "+size);
        }
    }
}
