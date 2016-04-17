package com.example.main;

/**
 * Created by codysmac on 4/17/16.
 */
public class Main {

    public static void main(String[] args) {
        String test = "hello what is up. this is a double space.  this is a line with no space.no space.";
        System.out.println(toUpper(test));
    }

    /**
     * Converts inputed sentence to proper uppercase form.
     * @param input the sentence to be checked.
     * @return the corrected sentence.
     */
    static String toUpper(String input) {
        String output;
        String array[];
        int j;
        array = input.split("");
        output = array[0].toUpperCase();
       // System.out.println(output);
        for (int i = 0; i < array.length; i++) {
            try {
                if (array[i].equals(".") || array[i].equals("?") || array[i].equals("!")) {
                    j=2;
                    if(array[i+2].equals(" ")){
                        j = 3;
                    }
                    if(!array[i+1].equals(" ")){
                        j=1;
                    }
                    array[i+j] = array[i+j].replace(array[i + j], array[i + j].toUpperCase());
                }
            }catch (ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        for (int i = 1; i< array.length; i++){
            output+= array[i];
        }
        return output;
    }
}
