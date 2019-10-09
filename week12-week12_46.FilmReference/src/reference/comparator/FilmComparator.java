/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Admin
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film film1, Film film2) {
        int buffer1 = 0;
        int buffer2 = 0;

        for (Rating value : ratings.get(film1)) {
            buffer1 += value.getValue();
        }
        int avg1 = buffer1 / ratings.get(film1).size();
        
        for (Rating value : ratings.get(film2)) {
            buffer2 += value.getValue();
        }
        int avg2 = buffer2 / ratings.get(film2).size();
        
        return avg2-avg1;
    }

}
