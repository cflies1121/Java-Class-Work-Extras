package main;

/**
 * Created by codysmac on 8/19/16.
 */
public class Main {

    public static void main(String[] args) {

        String a = "dujjjcon";
        String b = "acorn";
        System.out.println(b.compareToIgnoreCase(a));
        /*int numberOfMovies = 4;
        //establish array
        Movie[] movies = new Movie[numberOfMovies];
        //add array elements fyi movie dates are not accurate
        movies[0] = new Movie("troy", 1999);
        movies[1] = new Movie("Facebook");
        movies[2] = new Documentary("Happy Feet", 2004, "History");
        movies[3] = new Documentary("Release of Thor", 1988, "Social Injustice");
        // iterate through array with for loop and print out titles
       for(int i = 0; i<numberOfMovies; i++){
           Movie mv = movies[i];//gets the movie out of the array
           if(mv instanceof Documentary){//instanceOf checks the type at runtime
               Documentary doc = (Documentary) mv;//makes the movie cast to documentary
               System.out.println("Topic: " + doc.getTopic());//prints out the topic
           }
           else {
               System.out.println(movies[i].toString());//if not a documentary prints the title and year
           }

       }*/
    }
}

