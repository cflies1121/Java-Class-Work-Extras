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
     * Constructor for a new movie with a default year of 2015.
     * @param title the title of the movie
     */
    public Movie(String title){
        this.title = title;
        this.releaseYear = 2015;
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
        if(releaseYear>9999 || releaseYear<1000){
            System.out.println("Invalid year");
        }
        this.releaseYear = releaseYear;
    }

    /**
     * Overrides the default toString method.
     * @return The movie name and release year.
     */
    @Override
    public String toString(){
        return ("Movie Name: " + getTitle() + "\nRelease Year: " + getReleaseYear());
    }

    /**
     * Overrides the equals method to compare movie titles reguardless of case
     * @param object the movie that is being compared
     * @return whether the movie titles are equivalent.
     */
    @Override
    public boolean equals(Object object){
        final Movie movie = (Movie) object;// establishes the object as a movie in order to get proper methods
        String movieTitle1 = this.getTitle().toLowerCase();// changes the title to lowercase for comparison
        String movieTitle2 = movie.getTitle().toLowerCase();// same as above
        if(movieTitle1.equals(movieTitle2)){// compares the two titles as lowercase strings now
            return true;
        }
        return false;

    }
}

