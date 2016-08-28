package com.example.main;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by codysmac on 8/26/16.
 */
public class Trio<T extends Comparable<? super T>> implements Comparable<Trio<T>> {


    ArrayList<T> list;

    public Trio(T item1, T item2, T item3) {
        this.list = new ArrayList<>();
        this.list.add(item1);
        this.list.add(item2);
        this.list.add(item3);
    }


    public boolean contains(T item) {
        return this.list.contains(item);

    }

    public boolean sameItems() {
        return (Collections.frequency(this.list, this.getItem1()) == (this.list.size()));
    }////// if all items are the same then item1 will appear the same amount of times as the size of the list.

    public T getItem1() {
        return this.list.get(0);
    }

    public void setItem1(T item) {
        this.list.set(0, item);
    }

    public T getItem2() {
        return this.list.get(1);
    }

    public void setItem2(T item) {
        this.list.set(1, item);
    }

    public T getItem3() {
        return this.list.get(2);
    }

    public void setItem3(T item) {
        this.list.set(2, item);
    }

    @Override
    public String toString() {
        return "The Trio is {" +
                " item1 = " + getItem1() +
                ", item2 = " + getItem2() +
                ", item3 = " + getItem3() +
                " }";
    }

    @Override
    public int compareTo(Trio<T> otherTrio) {
        return smallestOf(this.list).compareTo(smallestOf(otherTrio.list));
    }

    private T smallestOf(ArrayList<T> list) {
        Collections.sort(list);
        return list.get(0);
    }


    @Override
    public boolean equals(Object o) {
        boolean sameItem1 = false;
        int count = 0;
        if (o instanceof Trio<?>) {
            Trio<?> otherTrio = (Trio<?>) o;
            ArrayList<T> temp1 = new ArrayList<>();
            ArrayList<T> temp2 = new ArrayList<>();
            for (int i = 0; i < this.list.size(); i++) {
                temp1.add(this.list.get(i));
                temp2.add((T) otherTrio.list.get(i));
            }
            Collections.sort(temp1);
            Collections.sort(temp2);

            for (int i = 0; i < temp1.size(); i++) {
                if (temp1.get(i).equals(temp2.get(i))) {
                    count++;}
            }
            if (count == 3) {
                sameItem1 = true;
            }

            return sameItem1;
        } else {
            return false;
        }

    }
}
