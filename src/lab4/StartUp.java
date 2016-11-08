
package lab4;

import common.lab3.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Jenna
 */
public class StartUp {
    
    public static void main(String[] args) {
        Movie m1 = new Movie("Gone With the Wind", "John Smith", 1);
        Movie m2 = new Movie("The Hangover", "Hungover Guy", 2);
        Movie m3 = new Movie("Pineapple Express", "Pineapple Hombre", 3);
        
        List<Movie> movieList = new ArrayList<>();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        
        Collections.sort(movieList, new MovieByDirector());
    }
    
    
    
}
