package model;

import enumeration.Genre;

/**
 * Creates an Object of type model.Song. And uses methods to give access to details about itself.
 * Has methods to print lyrics, get title, print song duration, to check if genres match/don't match with supplied genre.
 */
public class Song {
    private String title;
    private Genre genre;
    private int timing;
    private String lyrics;

    public Song(String title, Genre genre, int timing, String lyrics) {
        this.title = title;
        this.genre = genre;
        this.timing = timing;
        this.lyrics = lyrics;
    }

    /**
     * Gets the title of the model.Song and returns it.
     *
     * @return String - song's title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the field lyrics of model.Song and returns them.
     *
     * @return String - song's lyrics
     */
    public String printSongLyrics() {
        return lyrics;
    }

    /**
     * Gets the timing of the model.Song checks if it is valid and returns it formatted.
     *
     * @return String - the song's duration formatted in minutes and seconds - mm:ss
     * or
     * message to indicate a problem.
     */
    public String printSongDuration() {
        if (timing > 0) {
            int minutes = timing / 60;
            int seconds = timing % 60;
            return "model.Song duration: " + minutes + ":" + seconds;
        }
        return "The duration of the song is not specified.";
    }

    /**
     * Gets the genre of the song, validates it and compares it to a supplied genre.
     *
     * @param genreToMatch String - name of the genre to be compared to the song's genre
     * @return String - message if the song's genre and the supplied genre match.
     */
    public String checkIfGenresMatch(String genreToMatch) {
        if (isGenreValid()) {
            if (genreToMatch.equalsIgnoreCase(genre.toString())) {
                return "Genres match!";
            } else {
                return "enumeration.Genre doesn't match!";
            }
        }
        return "model.Song's genre is not present.";
    }

    public boolean isGenreValid() {
        return genre == null || genre.toString().isEmpty() || genre.toString().isBlank();

    }

    /**
     * Gets the all the objects fields to represent the information stored in them as a detailed, formatted string.
     *
     * @return String - song's details - title, genre, timing, lyrics
     */
    @Override
    public String toString() {
        return "model.Song Details:" + System.lineSeparator() +
                "\t* Title: " + title + System.lineSeparator() +
                "\t* enumeration.Genre: " + genre + System.lineSeparator() +
                "\t* Timing: " + timing + System.lineSeparator() +
                "\t* Lyrics: " + lyrics + System.lineSeparator();
    }
}