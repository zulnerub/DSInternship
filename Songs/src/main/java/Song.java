/**
 * Create object song has fields title, genre, timing, lyrics.
 * Has methods to print lyrics, get title, print song duration, to check if genres match/don't match with supplied genre.
 */
public class Song {
    private String title;
    private String genre;
    private int timing;
    private String lyrics;

    public Song(String title, String genre, int timing, String lyrics) {
        this.title = title;
        this.genre = genre;
        this.timing = timing;
        this.lyrics = lyrics;
    }

    /**
     * @return song's title;
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return song's lyrics
     */
    public String printSongLyrics() {
        return lyrics;
    }

    /**
     * @return the song's duration formated in minutes and seconds - mm:ss
     */
    public String printSongDuration() {
        int minutes = timing / 60;
        int seconds = timing % 60;

        return "Song duration: " + minutes + ":" + seconds;
    }

    /**
     * @param genreToMatch provided genre to compare with references genre
     * @return string representing whether the genres match or not
     */
    public String checkIfGenresMatch(String genreToMatch) {
        if (genre.toLowerCase().equals(genreToMatch.toLowerCase())) {
            return "Genres match!";
        } else {
            return "Genre doesn't match!";
        }
    }

    /**
     * @return String - song's details - title, genre, timing, lyrics
     */
    @Override
    public String toString() {

        return "Song Details:" + System.lineSeparator() +
                "\t* Title: " + title + System.lineSeparator() +
                "\t* Genre: " + genre + System.lineSeparator() +
                "\t* Timing: " + timing + System.lineSeparator() +
                "\t* Lyrics: " + lyrics + System.lineSeparator();
    }
}