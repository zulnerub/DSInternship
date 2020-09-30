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
        setTiming(timing);
        this.lyrics = lyrics;
    }

    /**
     * Setter to validate that a correct song duration is passed.
     *
     * @param timing int - integer value to indicate da duration of the song in seconds.
     */
    public void setTiming(int timing) {
        if (timing > 0) {
            this.timing = timing;
        }else{
            this.timing = 0;
        }
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
     * Gets the timing of the model.Song and returns it formatted.
     *
     * @return String - the song's duration formatted in minutes and seconds - mm:ss
     */
    public String printSongDuration() {
        int minutes = 0;
        int seconds = 0;
        if(timing > 0){
            minutes = timing / 60;
            seconds = timing % 60;
        }

        return "Song duration: " + minutes + ":" + seconds;
    }

    /**
     * Gets the genre of the song, validates it and compares it to a supplied genre.
     *
     * @param genreToMatch String - name of the genre to be compared to the song's genre
     * @return String - message if the song's genre and the supplied genre match.
     */
    public boolean checkIfGenresMatch(Genre genreToMatch) {
        if (isGenreValid()) {
            return genreToMatch == genre;
        } else {
            return false;
        }
    }

    /**
     * Gets the genre of the song and checks its validity.
     *
     * @return boolean - returns if the genre is valid or not.
     */
    public boolean isGenreValid() {
        return genre == null || genre.name().isBlank();
    }

    /**
     * Gets the all the objects fields to represent the information stored in them as a detailed, formatted string.
     *
     * @return String - song's details - title, genre, timing, lyrics
     */
    @Override
    public String toString() {
        return "Song Details:" +
                "\n\t* Title: " + title +
                "\n\t* Genre: " + genre +
                "\n\t* Timing: " + timing +
                "\n\t* Lyrics: " + lyrics + "\n";
    }
}