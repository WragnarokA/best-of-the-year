package com.experis.course.bestOfTheYear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    @ResponseBody
    public String index() {
        return "<html><body><h1>Best of the year by Wilmer<h1><bogy><html>";
    }


    @GetMapping("home")
    public String home(Model model) {

        String author = "Wilmer";
        model.addAttribute("author", author);
        return "home";
    }

    @GetMapping("/movies")
    public String getMovies(Model model) {
        List<String> movies = getBestMovies();
        String movieTitles = String.join(", ", movies);
        model.addAttribute("movieList", movieTitles);
        return "movies";
    }

    @GetMapping("/songs")
    public String getSongs(Model model) {
        List<String> songs = getBestSongs();
        String songTitles = String.join(", ", songs);
        model.addAttribute("songList", songTitles);
        return "songs";
    }


    private List<String> getBestMovies() {
        List<String> movies = new ArrayList<>();
        movies.add("Titolo Film 1");
        movies.add("Titolo Film 2");
        return movies;
    }

    private List<String> getBestSongs() {
        List<String> songs = new ArrayList<>();
        songs.add("Titolo Canzone 1");
        songs.add("Titolo Canzone 2");
        return songs;
    }


}

