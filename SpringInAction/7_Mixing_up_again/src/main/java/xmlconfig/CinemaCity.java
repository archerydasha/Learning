package xmlconfig;

import java.util.List;

/**
 * Created by Dasha on 09.04.16.
 */
public class CinemaCity implements Cinema {
    List<Movie> movies;

    public CinemaCity(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String printMovies() {
        String result = "";
        for (Movie movie : movies) {
            result += movie.getName() + "\n";
        }
        return result;
    }
}
