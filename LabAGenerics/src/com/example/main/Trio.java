package com.example.main;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by codysmac on 8/26/16.
 */
public class Trio<T extends Comparable<? super T>> implements Comparable<Trio<T>>{


    //private T item1;
   // private T item2;
    //private T item3;
    ArrayList<T> list;

    public Trio(T item1, T item2, T item3) {
        //this.item1 = item1;
        //this.item3 = item3;
        //this.item2 = item2;
        this.list = new ArrayList<>();
        this.list.add(item1);
        this.list.add(item2);
        this.list.add(item3);
        //Collections.sort(this.list);
    }



    public boolean contains(T item){
           return this.list.contains(item);

    }

    public boolean sameItems(){
        //System.out.println(" collections freq: " + Collections.frequency(this.list, this.getItem1()) + "list size: " +
        //this.list.size());
        return (Collections.frequency(this.list, this.getItem1())==(this.list.size()));
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
        /*int count =0;
        for(int i = 0; i<this.list.size(); i++){
            if(this.list.get(i).compareTo(otherTrio.list.get(i))==0){
                count++;
            }
        }
        if(count == 3){
            return 0;
        }
        else{
            return 1;
        }*/
        /*int value1 = 0, value2 = 0, value3 = 0;
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i) + " = " + otherTrio.list.get(i));
            if(this.list.get(i).compareTo(otherTrio.list.get(i))==0){
                value1 = 0;
            }
            if(this.list.get(i).compareTo(otherTrio.list.get(i))>0){
                value2 += 100;
            }
            if (this.list.get(i).compareTo(otherTrio.list.get(i))<0){
                value3 += -100;
            }
            System.out.println(("list.compare = " + this.list.get(i).compareTo(otherTrio.list.get(i)) + " value1 = " + value1
                    + " value2 " + value2 + " value3 " + value3 + " i " + i));


        }*/
        return smallestOf(this.list).compareTo(smallestOf(otherTrio.list));
    }
    private T smallestOf(ArrayList<T> list){
        Collections.sort(list);
        /*for(int i = 0; i<3; i++){
            System.out.println(list.get(i) + " list item " + i + " int smallest of method");
        }*/
        return list.get(0);
    }


    @Override
    public boolean equals(Object o) {
        boolean sameItem1 = false;//, sameItem2 = false, sameItem3 = false;
        int count = 0;
        if(o instanceof Trio<?>) {
            Trio<?> otherTrio = (Trio<?>) o;
            ArrayList<T> temp1 = new ArrayList<>();
            ArrayList<T> temp2 = new ArrayList<>();
            for(int i = 0; i<this.list.size(); i++) {
                temp1.add(this.list.get(i));
                temp2.add((T) otherTrio.list.get(i));
                //System.out.println("temp one list# " + i + " is " + temp1.get(i));
                //System.out.println("temp two list# " + i + " is " + temp2.get(i));
            }
            Collections.sort(temp1);
            Collections.sort(temp2);
            //for(int i = 0; i<3; i++) {
                //System.out.println("after sort, temp one is # " + i + " is " + temp1.get(i));
                //System.out.println("after sort, temp two is # " + i + " is " + temp2.get(i));
            //}

            for (int i = 0; i<temp1.size(); i++){
                if(temp1.get(i).equals(temp2.get(i))){
                    count++;
                    //System.out.println(temp1.get(i) + " = " + temp2.get(i) + " on number " + i + " the value of count is" + count);
                }
            }
            //System.out.println(sameItem1 + " " + sameItem2 + " " + sameItem3 + " count = " + count + " before count check");
            if(count == 3){
                sameItem1 = true;
                //sameItem2 = true;
                //sameItem3 = true;
                //System.out.println("value of count " + count);
            }
            //System.out.println(sameItem1 + " " + sameItem2 + " " + sameItem3 + " after count check");




            return sameItem1 ;//&& sameItem2 && sameItem3;
        }
        else{
            return false;
        }

    }
}
