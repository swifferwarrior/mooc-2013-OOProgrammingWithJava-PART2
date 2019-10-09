/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;



public class Reference {
    //uses the ratings in the rating register to elaborate a recommendation
    private RatingRegister register;
    List<String> films = new ArrayList<String>();

    public Reference(RatingRegister ratingRegister) {
        this.register = ratingRegister;
    }
    
    public Film recommendFilm(Person person){
        //recommends films to people
        //need: filmcomparator, filmRatings() of ratingregister, list of existing films
        
        //If person hasn't seen anything, recommend top film
        if(register.getPersonalRatings(person).isEmpty()){
            List<Film> films = new ArrayList<Film>(register.filmRatings().keySet());
            Collections.sort(films,new FilmComparator(register.filmRatings()));
            return films.get(0);
        }
        
        //Recommendations based on similarities between person and other people
        //similarity = sum of the products of the ratings for the films watched by both
        //      i.e. -5 * -5 = 25 (highly similar) and -5 * 3 = -15 (highly unsimilar)
        //if boolean similar = true >> recommend positive films person has not seen
        
    }
}
