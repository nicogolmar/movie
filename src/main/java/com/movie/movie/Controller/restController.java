package com.movie.movie.Controller;

import com.movie.movie.Entity.Movie;
import com.movie.movie.Repository.RepositoryMovies;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class restController {

    RepositoryMovies repositoryMovies;

    private final Logger log = LoggerFactory.getLogger(Movie.class);

    public restController(RepositoryMovies repositoryMovies) {
        this.repositoryMovies = repositoryMovies;
    }


    @GetMapping("/api/home")
    public List<Movie> findAll() {
        return repositoryMovies.findAll();
    }

    @GetMapping("/api/movieId/{id}")
    public ResponseEntity<Movie> findById(@PathVariable Long id) {

        Optional<Movie> movieOpt = repositoryMovies.findById(id);

        return movieOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }

    @PostMapping("/api/movie/create")
    public ResponseEntity<Movie> crate(@RequestBody Movie movie) {

        if (movie.getId() != null) {

            log.warn("Error al crear libro id existente");
            ResponseEntity.notFound().build();
        }
        Movie result = repositoryMovies.save(movie);
        return ResponseEntity.ok(result);


    }

    @PutMapping("/api/movie/update")
    public ResponseEntity<Movie> update(@RequestBody Movie movie) {

        if (movie.getId() == null) {

            log.warn("Error al actualizar pelicula, id nonexistent");
            ResponseEntity.badRequest().build();
        }

        if (movie.getId() != null) {

            Movie result = repositoryMovies.save(movie);
            return ResponseEntity.ok(result);
        }
        if (!repositoryMovies.existsById(movie.getId())) {
            log.warn("error al crear libro ");
            return ResponseEntity.notFound().build();
        }
        Movie result = repositoryMovies.save(movie);

        return ResponseEntity.ok(result);

    }
    @DeleteMapping("/api/movieDelete/{id}")
    public ResponseEntity<Movie> delete(@PathVariable Long id , @RequestBody Movie movie) {
        if (!repositoryMovies.existsById(movie.getId())) {
            log.warn("error al borrar libro id inexistente ");
            return ResponseEntity.notFound().build();
        }
        repositoryMovies.deleteById(id);

        return ResponseEntity.noContent().build();

    }

}


