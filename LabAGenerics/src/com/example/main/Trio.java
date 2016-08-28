package com.example.main;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by codysmac on 8/26/16.
 */
public class Trio<T extends Comparable<? super T>> implements Comparable<Trio<T>> {


    ArrayList<T> list;// an array list to hold all the values of the trio

    public Trio(T item1, T item2, T item3) {
        this.list = new ArrayList<>();
        this.list.add(item1);
        this.list.add(item2);
        this.list.add(item3);
    }

    /**
     * Does the Trio contain the item given.
     * @param item an item that might be in the Trio.
     * @return if the item is in the Trio
     */

    public boolean contains(T item) {
        return this.list.contains(item);
    }

    /**
     * Checks if all of the items in the trio are the same.
     * @return boolean of all the items being the same.
     */
    public boolean sameItems() {
        return (Collections.frequency(this.list, this.getItem1()) == (this.list.size()));
    }////// if all items are the same then item1 will appear the same amount of times as the size of the list.

    /**
     *
     * @return Item 1.
     */
    public T getItem1() {
        return this.list.get(0);
    }

    /**
     *
     * @param item the item you would like to be item 1.
     */
    public void setItem1(T item) {
        this.list.set(0, item);
    }
    /**
     *
     * @return Item 2.
     */
    public T getItem2() {
        return this.list.get(1);
    }
    /**
     *
     * @param item the item you would like to be item 2.
     */
    public void setItem2(T item) {
        this.list.set(1, item);
    }
    /**
     *
     * @return Item 3.
     */
    public T getItem3() {
        return this.list.get(2);
    }
    /**
     *
     * @param item the item you would like to be item 3.
     */
    public void setItem3(T item) {
        this.list.set(2, item);
    }

    /**
     *
     * @return the trio description as a string.
     */
    @Override
    public String toString() {
        return "The Trio is {" +
                " item1 = " + getItem1() +
                ", item2 = " + getItem2() +
                ", item3 = " + getItem3() +
                " }";
    }

    /**
     * Compares the smallest member of two trio's.
     * @param otherTrio the other Trio that is being compared.
     * @return which Trio is the smaller or larger of the two.
     */
    @Override
    public int compareTo(Trio<T> otherTrio) {
        return smallestOf(this.list).compareTo(smallestOf(otherTrio.list));
    }

    /**
     * Arranges the arrayList given and returns the smallest value.
     * @param list the arrayList to be arranged.
     * @return the smallest value of the arrayList.
     */
    private T smallestOf(ArrayList<T> list) {
        Collections.sort(list);
        return list.get(0);
    }

    /**
     * compares two objects.
     * @param o the object to be compared.
     * @return boolean of objects compared.
     */
    @Override
    public boolean equals(Object o) {
        boolean sameItem1 = false;
        int count = 0;
        if (o instanceof Trio<?>) {// checks if the object is a Trio.
            Trio<?> otherTrio = (Trio<?>) o;
            ArrayList<T> temp1 = new ArrayList<>();// creates two temp arrays for sorting
            ArrayList<T> temp2 = new ArrayList<>();
            for (int i = 0; i < this.list.size(); i++) {// adds elements from orignal lists to temp list for sorting
                temp1.add(this.list.get(i));
                temp2.add((T) otherTrio.list.get(i));
            }
            Collections.sort(temp1);//sorts lists
            Collections.sort(temp2);

            for (int i = 0; i < temp1.size(); i++) {/// checks if the list items are equal one by one.
                if (temp1.get(i).equals(temp2.get(i))) {
                    count++;// if list item is equal then count increases.
                }
            }
            if (count == temp1.size()) {// if the count meets the size of the array given then all values are equal
                sameItem1 = true;
            }

            return sameItem1;
        } else {
            return false;
        }

    }
}
