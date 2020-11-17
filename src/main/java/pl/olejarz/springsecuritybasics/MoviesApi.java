package pl.olejarz.springsecuritybasics;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MoviesApi {

    private List<Movies> moviesList;

    public MoviesApi() {
        this.moviesList = new ArrayList<>();
        moviesList.add(new Movies("Titanic", "Steven Spielberg"));
        moviesList.add(new Movies("Django", "Quentin Tarantino"));

    }

    @GetMapping("/api")
    public List<Movies> getAll() {
        return moviesList;

    }
    @PostMapping("/api")
    public boolean add(@RequestBody Movies movie) {
        return moviesList.add(movie);
    }
    @DeleteMapping("/api")
    public void delete(@RequestParam int index) {
         moviesList.remove(index);
    }

}
