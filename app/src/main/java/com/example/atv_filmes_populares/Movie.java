package com.example.atv_filmes_populares;

import org.json.JSONArray;

public class Movie {
    public final String title;
    public final String overview;
    public final String poster_path;

    public Movie(
            String title,
            String overView,
            String posterPath
    ){
        this.title = title;
        this.overview = overView;
        this.poster_path = posterPath;
    }

}
