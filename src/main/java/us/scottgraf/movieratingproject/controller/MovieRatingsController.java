package us.scottgraf.movieratingproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import us.scottgraf.movieratingproject.Service.MovieRatingsService;

import java.util.List;

@RestController
public class MovieRatingsController {

    @Autowired
    private MovieRatingsService movieRatingsService;

    @RequestMapping("/movies")
    public List<MovieRatings> getThanks(){
        return movieRatingsService.getAllMovies();
    }

    @RequestMapping("/movieRatings/{id}")
    public MovieRatings getMovie(@PathVariable String id){
        return movieRatingsService.getMovie(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/movies")
    public void addMovie(@RequestBody MovieRatings movies){
        movieRatingsService.addMovie(movies);
    }
}
