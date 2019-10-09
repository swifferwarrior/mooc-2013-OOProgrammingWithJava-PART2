package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {

    private Map<Film, List<Rating>> filmRatings = new HashMap<Film, List<Rating>>();
    private Map<Person, Map<Film, Rating>> personalRatings = new HashMap<Person, Map<Film, Rating>>();
    private List<Person> reviewers = new ArrayList<Person>();

    public RatingRegister() {
    }

    public void addRating(Film film, Rating rating) {
        //adds a new rating to the parameter film. The same film can have various same ratings
        if (!filmRatings.containsKey(film)) {
            filmRatings.put(film, new ArrayList<Rating>());
        }

        try {
            filmRatings.get(film).add(rating);
        } catch (Exception e) {
            List<Rating> ratings = new ArrayList<Rating>();
            ratings.add(rating);
            filmRatings.put(film, ratings);
        }
    }

    public List<Rating> getRatings(Film film) {
        //returns a list of the ratings which were added in connection to a film
        try {
            return filmRatings.get(film);
        } catch (Exception e) {
            return null;
        }
    }

    public Map<Film, List<Rating>> filmRatings() {
        //returns a map whose keys are the evaluated films. Each film is assoc
        //to alist containing the ratings for that film
        return filmRatings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        //adds the rating of a specific film to the parameter person
        //the same person can recommend a specific film only once
        //the person rating has to also be added to the ratings connected to all films
        if (!reviewers.contains(person)) {
            reviewers.add(person);
        }

        if (personalRatings.containsKey(person)) {
            if (personalRatings.get(person).containsKey(film)) {
                personalRatings.get(person).remove(film);
            }
            personalRatings.get(person).put(film, rating);
            addRating(film, rating);
        } else {
            personalRatings.put(person, new HashMap<Film, Rating>());
            personalRatings.get(person).put(film, rating);
            addRating(film, rating);
        }

        if (!personalRatings.containsKey(person)) {
            Map ratings = new HashMap<Film, Rating>();
            ratings.put(film, rating);
            addRating(film, rating);
            personalRatings.put(person, ratings);
        }
    }

    public Rating getRating(Person person, Film film) {
        //returns the rating the parameter person has assigned to the parameter film.
        //If the person hasn't evaluated such film, the method returns Rating.NOT_WATCHED
        try {
            return personalRatings.get(person).get(film);
        } catch (Exception e) {
            return personalRatings.get(person).put(film, Rating.NOT_WATCHED);
        }
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        //returns a HashMap which contains the person's ratings. The HashMap keys
        //are the evaluated films, and their values are the ratings of these films
        return personalRatings.get(person);
    }

    public List<Person> reviewers() {
        //returns a list of the people who have evaluated the films
        return reviewers;
    }
}
