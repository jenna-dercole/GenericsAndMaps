package common.lab2;

import common.lab1.*;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie implements Comparable {
    private String title;
    private String director;
    private int movieId;

    public Movie(String title, String director, int movieId) {
        this.title = title;
        this.director = director;
        this.movieId = movieId;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.movieId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (this.movieId != other.movieId) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        
        Movie m = (Movie)o;
        
        return new CompareToBuilder()
            .append(this.movieId, m.movieId)
            .toComparison();
    }
    

}
