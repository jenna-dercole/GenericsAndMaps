/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Comparator;

/**
 *
 * @author Jenna
 */
public class MovieByDirector implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getDirector().compareTo(m2.getDirector());
    }
    
}
