package com.movie.movie.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double duration;
    private LocalDate date;
    private String lead_actor;

    public Movie() {
    }

    public Movie(Long id, String title, Double duration, LocalDate date, String lead_actor) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.date = date;
        this.lead_actor = lead_actor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLead_actor() {
        return lead_actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", date=" + date +
                ", lead_actor='" + lead_actor + '\'' +
                '}';
    }

    public void setLead_actor(String lead_actor) {
        this.lead_actor = lead_actor;
    }


}
