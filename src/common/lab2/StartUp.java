
package common.lab2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jenna
 */
public class StartUp {
    public static void main(String[] args) {
        Movie m1 = new Movie("American Beauty", "Sam Mendes", 1);
        Movie m2 = new Movie("Ghost World", "Terry Zwigoff", 2);
        Movie m3 = new Movie("The Graduate", "Mike Nichols", 3);
        Movie m4 = new Movie("Ghsot World", "Terry Zwigoff", 2);
        
        Map movieMap = new HashMap();
        movieMap.put(1, "American Beauty");
        movieMap.put(3, "The Graduate");
        movieMap.put(2, "Ghost World");
        
        System.out.println(movieMap.get(3));
        
        System.out.println("\nOutputting movie titles...");
        Set keys = movieMap.keySet();
        for(Object key: keys) {
            System.out.println(movieMap.get(key));
        }
        
        //versus...
        
         System.out.println("\nOutputting movie titles again...");
        Collection<Movie> values = movieMap.values();
        for (Object movie : values) {
            System.out.println(movie);
        }
        
        System.out.println("\nOutputting key values...");
        Set keys2 = movieMap.keySet();
        for(Object key: keys2) {
            System.out.println(key);
        }
        
    }
}
