package main;

/**
 * Created by codysmac on 8/21/16.
 */
public class Documentary extends Movie{

    private String topic;//Topic of the movie

    /**
     * Constructs a new Documentary movie
     * @param title title of the movie.
     * @param releaseYear release year of the movie.
     * @param topic topic of the movie.
     */
    public Documentary(String title, int releaseYear,String topic){
        super(title, releaseYear);
        this.topic = topic;
    }

    /**
     * Constructs a new Documentary movie without a topic.
     * @param title
     * @param releaseYear
     */
    public Documentary(String title, int releaseYear){
        super(title, releaseYear);
        this.topic = "unkown";
    }

    /**
     *
     * @param topic the topic of the movie
     */
    public void setTopic(String topic){
        this.topic = topic;
    }

    /**
     *
     * @return the topic of the movie
     */
    public String getTopic(){
        return this.topic;
    }

    /**
     *
     * @return the string representation of a movie plus fields for a documentary
     */
    @Override
    public String toString(){
        return (super.toString() + "\nTopic: " + getTopic());
    }
}
