package main;

/**
 * Created by codysmac on 8/19/16.
 */
public class Main {

    public static void main(String[] args) {
        Movie newMov1 = new Movie("Hey Yo", 1988);
        Movie newMov2 = new Movie("hey yo", 1988);
        if(newMov1.equals(newMov2)){
            System.out.println("equals");
        }
    }
}
