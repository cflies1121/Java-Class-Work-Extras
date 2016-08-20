package main;

/**
 * Created by codysmac on 8/19/16.
 */
public class Movie {

    private String title;
    private int releaseYear;

    public Movie(String title, int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle (){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }
}

