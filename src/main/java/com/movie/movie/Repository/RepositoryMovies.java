package com.movie.movie.Repository;

import com.movie.movie.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMovies extends JpaRepository<Movie,Long> {


}
