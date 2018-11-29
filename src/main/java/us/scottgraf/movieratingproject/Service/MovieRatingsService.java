package us.scottgraf.movieratingproject.Service;

import org.springframework.stereotype.Service;
import us.scottgraf.movieratingproject.controller.MovieRatings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieRatingsService {
    private List<MovieRatings> movies = new ArrayList<>(Arrays.asList(
            new MovieRatings("Hitch", 4),
            new MovieRatings("Avengers", 5),
            new MovieRatings("Simpsons The Movie", 3),
            new MovieRatings("Scorpin King", 4),
            new MovieRatings("Paranormal Activity", 2)
    ));

    public List<MovieRatings>getAllMovies(){
        return movies;
    }

    public MovieRatings getMovie(String id){
        return movies.stream().filter(t -> t.getName().contains(id)).findFirst().get();
    }

    public void addMovie(MovieRatings movie){
        movies.add(movie);
    }
}
