package main;

/**
 * Created by codysmac on 8/19/16.
 */
public class Movie {

    private String title;
    private int releaseYear;

    /**
     * Constructor for a new movie
     * @param title title of the movie.
     * @param releaseYear the release year of the movie
     */
    public Movie(String title, int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
    }

    /**
     *
     * @return the title of the movie.
     */
    public String getTitle (){
        return this.title;
    }

    /**
     * Changes or sets the title of the movie.
     * @param title the title of the movie.
     */
    public void setTitle(String title){
        this.title = title;
    }

    /**
     *
     * @return the release year of the movie.
     */
    public int getReleaseYear(){
        return this.releaseYear;
    }

    /**
     * Changes or sets the release year of the movie.
     * @param releaseYear the release year of the movie.
     */
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    /**
     * Overides the default toString method.
     * @return The movie name and release year.
     */
    @Override
    public String toString(){
        return ("Movie Name: " + getTitle() + "\nRelease Year: " + getReleaseYear());
    }

    @Override
    public boolean equals(Object object){
        final Movie movie = (Movie) object;
        String movieTitle1 = this.getTitle().toLowerCase();
        String movieTitle2 = movie.getTitle().toLowerCase();
        if(movieTitle1.equals(movieTitle2)){
            return true;
        }
        return false;

    }
}

